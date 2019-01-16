package com.smalaca.mediator.security;

import com.smalaca.mediator.accountancy.AccountancyHistory;
import com.smalaca.mediator.usermanagement.AccountService;
import com.smalaca.mediator.usermanagement.Account;

public class SecurityService {
    private final AccountancyHistory accountancyHistory;
    private final AccountService accountService;

    public SecurityService(AccountancyHistory accountancyHistory, AccountService accountService) {
        this.accountancyHistory = accountancyHistory;
        this.accountService = accountService;
    }

    public boolean check(Account account) {
        if (valid(account)) {
            return accountancyHistory.verify(account) && accountService.verify(account);
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
