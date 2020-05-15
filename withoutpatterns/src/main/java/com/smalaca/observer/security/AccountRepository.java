package com.smalaca.observer.security;

public interface AccountRepository {
    Account findOf(String userId);

    void save(Account account);
}
