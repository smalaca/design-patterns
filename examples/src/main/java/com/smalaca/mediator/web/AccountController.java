package com.smalaca.mediator.web;

import com.smalaca.mediator.Mediator;
import com.smalaca.mediator.usermanagement.Account;
import com.smalaca.mediator.usermanagement.AccountRepository;

public class AccountController {
    private final Mediator mediator;
    private final AccountRepository accountRepository;

    public AccountController(Mediator mediator, AccountRepository accountRepository) {
        this.mediator = mediator;
        this.accountRepository = accountRepository;
    }

    private void accept(String accountId) {
        Account account = accountRepository.findBy(accountId);
        account.activate();

        accountRepository.save(account);

        mediator.newActiveAccount(account);
    }
}
