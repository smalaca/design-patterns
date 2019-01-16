package com.smalaca.mediator.usermanagement;

public interface AccountRepository {
    Account findBy(String accountId);

    void save(Account account);
}
