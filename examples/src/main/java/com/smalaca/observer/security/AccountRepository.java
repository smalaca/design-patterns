package com.smalaca.observer.security;

interface AccountRepository {
    Account findOf(String userId);

    void save(Account account);
}
