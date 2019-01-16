package com.smalaca.mediator;

import com.smalaca.mediator.accountancy.AccountancyHistory;
import com.smalaca.mediator.security.SecurityService;
import com.smalaca.mediator.usermanagement.Account;
import com.smalaca.mediator.usermanagement.AccountRequest;
import com.smalaca.mediator.usermanagement.AccountService;

public class Mediator {
    private final AccountancyHistory accountancyHistory;
    private final AccountService accountService;
    private final SecurityService securityService;

    public Mediator(AccountancyHistory accountancyHistory, AccountService accountService, SecurityService securityService) {
        this.accountancyHistory = accountancyHistory;
        this.accountService = accountService;
        this.securityService = securityService;
    }

    public boolean isAcceptable(AccountRequest accountRequest) {
        return accountancyHistory.verify(accountRequest);
    }

    public boolean isValid(Account account) {
        return accountancyHistory.verify(account) && accountService.verify(account);
    }

    public void newActiveAccount(Account account) {
        accountancyHistory.openHistoryFor(account);
        accountService.register(account);
        securityService.startMonitoring(account);
    }
}
