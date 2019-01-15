package com.smalaca.chainofresponsibility.continuousintegration;

import com.smalaca.chainofresponsibility.domain.Branch;

public interface ContinousIntegrationStep {
    void process(Branch branch);
}
