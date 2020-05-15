package com.smalaca.observer.security;

import com.smalaca.observer.auth.AuthResult;

public class AccountSecurityService {
    private final AccountRepository accountRepository;

    public AccountSecurityService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void blockAnAccount(String accountId) {
        Account account = accountRepository.findOf(accountId);

        account.block();
        accountRepository.save(account);
    }

    public void notifyAboutThirdFailure(AuthResult result) {
        blockAnAccount(result.userId());
    }
}
