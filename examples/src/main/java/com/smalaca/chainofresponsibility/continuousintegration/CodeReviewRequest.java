package com.smalaca.chainofresponsibility.continuousintegration;

import com.smalaca.chainofresponsibility.domain.Branch;
import com.smalaca.chainofresponsibility.domain.User;
import com.smalaca.chainofresponsibility.domain.UserRepository;
import com.smalaca.chainofresponsibility.mail.MailClient;

class CodeReviewRequest implements ContinousIntegrationStep{
    private final MailClient mailClient;
    private final UserRepository userRepository;
    private final String reviewerId;

    CodeReviewRequest(MailClient mailClient, UserRepository userRepository, String reviewerId) {
        this.mailClient = mailClient;
        this.userRepository = userRepository;
        this.reviewerId = reviewerId;
    }

    @Override
    public void process(Branch branch) {
        mailClient.sendTo(branch.anAuthor(), branch.name(), "Builds are green.");
        User reviewer = userRepository.findBy(reviewerId);
        mailClient.sendTo(reviewer, branch.name(), "You can start review.");
    }
}
