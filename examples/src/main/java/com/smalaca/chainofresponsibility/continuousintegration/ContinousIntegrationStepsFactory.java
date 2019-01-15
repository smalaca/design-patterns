package com.smalaca.chainofresponsibility.continuousintegration;

import com.smalaca.chainofresponsibility.domain.BranchRepository;
import com.smalaca.chainofresponsibility.domain.Builds;
import com.smalaca.chainofresponsibility.domain.UserRepository;
import com.smalaca.chainofresponsibility.mail.MailClient;

public class ContinousIntegrationStepsFactory {
    private final MailClient mailClient;
    private final BranchRepository branchRepository;
    private final UserRepository userRepository;
    private final Builds builds;

    public ContinousIntegrationStepsFactory(
            MailClient mailClient, BranchRepository branchRepository, UserRepository userRepository, Builds builds) {
        this.mailClient = mailClient;
        this.branchRepository = branchRepository;
        this.userRepository = userRepository;
        this.builds = builds;
    }

    public ContinousIntegrationStep createFor(String reviewerId) {
        ContinousIntegrationStep failedStep = new FailedBuilds(mailClient);

        return new PersistNewBranch(branchRepository,
                new StaticAnalysisBuild(builds,
                        new TestsBuild(builds,
                                new CodeReviewRequest(mailClient, userRepository, reviewerId), failedStep
                        ), failedStep
                )
        );
    }
}
