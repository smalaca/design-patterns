package com.smalaca.mediator.accountancy;

import com.smalaca.mediator.Mediator;
import com.smalaca.mediator.usermanagement.Account;
import com.smalaca.mediator.usermanagement.AccountRequest;

public class AccountancyHistory {
    private final Mediator mediator;

    public AccountancyHistory(Mediator mediator) {
        this.mediator = mediator;
    }

    public void openHistoryFor(Account account) {
        // some functionality
    }

    public boolean verify(Account account) {
        // some functionality
        return false;
    }

    public boolean verify(AccountRequest accountRequest) {
        // some functionality
        return false;
    }
}
