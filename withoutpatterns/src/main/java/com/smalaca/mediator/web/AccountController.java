package com.smalaca.mediator.web;

import com.smalaca.mediator.accountancy.AccountancyHistory;
import com.smalaca.mediator.security.SecurityService;
import com.smalaca.mediator.usermanagement.Account;
import com.smalaca.mediator.usermanagement.AccountRepository;
import com.smalaca.mediator.usermanagement.AccountService;

public class AccountController {
    private final AccountancyHistory accountancyHistory;
    private final AccountService accountService;
    private final SecurityService securityService;
    private final AccountRepository accountRepository;

    public AccountController(
            AccountancyHistory accountancyHistory, AccountService accountService, SecurityService securityService,
            AccountRepository accountRepository) {
        this.accountancyHistory = accountancyHistory;
        this.accountService = accountService;
        this.securityService = securityService;
        this.accountRepository = accountRepository;
    }

    private void accept(String accountId) {
        Account account = accountRepository.findBy(accountId);
        account.activate();

        accountRepository.save(account);
        accountancyHistory.openHistoryFor(account);
        accountService.register(account);
        securityService.startMonitoring(account);
    }
}
