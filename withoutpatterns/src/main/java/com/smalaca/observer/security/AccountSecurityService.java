package com.smalaca.observer.security;

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
}
