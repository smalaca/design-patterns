package com.smalaca.chainofresponsibility.web;

import com.smalaca.chainofresponsibility.continuousintegration.ContinousIntegrationStep;
import com.smalaca.chainofresponsibility.continuousintegration.ContinousIntegrationStepsFactory;
import com.smalaca.chainofresponsibility.domain.Branch;
import com.smalaca.chainofresponsibility.domain.User;
import com.smalaca.chainofresponsibility.domain.UserRepository;

public class BranchController {
    private final ContinousIntegrationStepsFactory factory;
    private final UserRepository userRepository;

    public BranchController(ContinousIntegrationStepsFactory factory, UserRepository userRepository) {
        this.factory = factory;
        this.userRepository = userRepository;
    }

    public void createNew(String name, String authorId, String reviewerId) {
        User author = userRepository.findBy(authorId);
        Branch branch = new Branch(name, author);

        ContinousIntegrationStep steps = factory.createFor(reviewerId);
        steps.process(branch);
    }
}
