package com.smalaca.chainofresponsibility.web;

import com.smalaca.chainofresponsibility.domain.Branch;
import com.smalaca.chainofresponsibility.domain.BranchRepository;
import com.smalaca.chainofresponsibility.domain.BuildResult;
import com.smalaca.chainofresponsibility.domain.Builds;
import com.smalaca.chainofresponsibility.domain.User;
import com.smalaca.chainofresponsibility.domain.UserRepository;
import com.smalaca.chainofresponsibility.mail.MailClient;

public class BranchController {
    private final MailClient mailClient;
    private final BranchRepository branchRepository;
    private final UserRepository userRepository;
    private final Builds builds;

    public BranchController(
            MailClient mailClient, BranchRepository branchRepository, UserRepository userRepository, Builds builds) {
        this.mailClient = mailClient;
        this.branchRepository = branchRepository;
        this.userRepository = userRepository;
        this.builds = builds;
    }

    public void createNew(String name, String authorId, String reviewerId) {
        User author = userRepository.findBy(authorId);
        Branch branch = new Branch(name, author);
        branchRepository.save(branch);

        BuildResult staticAnalysisResult = builds.staticAnalysisOf(branch);

        if (staticAnalysisResult.successful()) {
            BuildResult testsResult = builds.testsOf(branch);

            if (testsResult.successful()) {
                mailClient.sendTo(branch.anAuthor(), branch.name(), "Builds are green.");
                User reviewer = userRepository.findBy(reviewerId);
                mailClient.sendTo(reviewer, branch.name(), "You can start review.");

            } else {
                mailClient.sendTo(branch.anAuthor(), branch.name(), "Failed builds");
            };
        } else {
            mailClient.sendTo(branch.anAuthor(), branch.name(), "Failed builds");
        }
    }
}
