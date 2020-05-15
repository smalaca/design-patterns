package com.smalaca.observer.security;

import com.smalaca.observer.auth.AuthResult;
import com.smalaca.observer.web.AuthenticationFailureObserver;

public class AccountSecurityService implements AuthenticationFailureObserver {
    private final AccountRepository accountRepository;

    public AccountSecurityService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void blockAnAccount(String accountId) {
        Account account = accountRepository.findOf(accountId);

        account.block();
        accountRepository.save(account);
    }

    @Override
    public void notifyAboutThirdFailure(AuthResult result) {
        blockAnAccount(result.userId());
    }
}
