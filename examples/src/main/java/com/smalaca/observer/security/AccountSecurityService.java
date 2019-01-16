package com.smalaca.observer.security;

import com.smalaca.observer.auth.AuthResult;
import com.smalaca.observer.auth.AuthenticationObserver;

public class AccountSecurityService implements AuthenticationObserver {
    private final AccountRepository accountRepository;

    public AccountSecurityService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void notifyOf(AuthResult result) {
        Account account = accountRepository.findOf(result.userId());

        account.block();
        accountRepository.save(account);
    }
}
