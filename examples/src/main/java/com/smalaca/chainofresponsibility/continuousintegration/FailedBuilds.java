package com.smalaca.chainofresponsibility.continuousintegration;

import com.smalaca.chainofresponsibility.domain.Branch;
import com.smalaca.chainofresponsibility.mail.MailClient;

class FailedBuilds implements ContinousIntegrationStep {
    private final MailClient mailClient;

    FailedBuilds(MailClient mailClient) {
        this.mailClient = mailClient;
    }

    @Override
    public void process(Branch branch) {
        mailClient.sendTo(branch.anAuthor(), branch.name(), "Failed builds");
    }
}
