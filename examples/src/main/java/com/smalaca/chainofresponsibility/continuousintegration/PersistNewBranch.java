package com.smalaca.chainofresponsibility.continuousintegration;

import com.smalaca.chainofresponsibility.domain.Branch;
import com.smalaca.chainofresponsibility.domain.BranchRepository;

class PersistNewBranch implements ContinousIntegrationStep {
    private final BranchRepository branchRepository;
    private final ContinousIntegrationStep nextStep;

    PersistNewBranch(BranchRepository branchRepository, ContinousIntegrationStep nextStep) {
        this.branchRepository = branchRepository;
        this.nextStep = nextStep;
    }

    @Override
    public void process(Branch branch) {
        branchRepository.save(branch);
        nextStep.process(branch);
    }
}
