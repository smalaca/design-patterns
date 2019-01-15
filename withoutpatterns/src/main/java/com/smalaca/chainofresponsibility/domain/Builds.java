package com.smalaca.chainofresponsibility.domain;

public interface Builds {
    BuildResult testsOf(Branch branch);

    BuildResult staticAnalysisOf(Branch branch);
}
