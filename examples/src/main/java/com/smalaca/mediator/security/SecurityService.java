package com.smalaca.mediator.security;

import com.smalaca.mediator.Mediator;
import com.smalaca.mediator.usermanagement.Account;

public class SecurityService {
    private final Mediator mediator;

    public SecurityService(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean check(Account account) {
        if (valid(account)) {
            return mediator.isValid(account);
        } else {
            return false;
        }
    }

    private boolean valid(Account account) {
        return false;
    }

    public void startMonitoring(Account account) {
        // some functionality
    }
}
