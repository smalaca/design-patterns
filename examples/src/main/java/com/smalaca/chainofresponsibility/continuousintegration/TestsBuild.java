package com.smalaca.chainofresponsibility.continuousintegration;

import com.smalaca.chainofresponsibility.domain.Branch;
import com.smalaca.chainofresponsibility.domain.BuildResult;
import com.smalaca.chainofresponsibility.domain.Builds;

class TestsBuild implements ContinousIntegrationStep {
    private final Builds builds;
    private final ContinousIntegrationStep successStep;
    private final ContinousIntegrationStep failedStep;

    TestsBuild(Builds builds, ContinousIntegrationStep successStep, ContinousIntegrationStep failedStep) {
        this.builds = builds;
        this.successStep = successStep;
        this.failedStep = failedStep;
    }

    @Override
    public void process(Branch branch) {
        BuildResult buildResult = builds.testsOf(branch);

        if (buildResult.successful()) {
            successStep.process(branch);
        } else {
            failedStep.process(branch);
        }
    }
}
