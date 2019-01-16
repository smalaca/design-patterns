package com.smalaca.mediator.usermanagement;

import com.smalaca.mediator.accountancy.AccountancyHistory;

public class AccountService {
    private final AccountancyHistory accountancyHistory;
    private final AccountRequestService accountRequestService;

    public AccountService(AccountancyHistory accountancyHistory, AccountRequestService accountRequestService) {
        this.accountancyHistory = accountancyHistory;
        this.accountRequestService = accountRequestService;
    }


    public void createReuqest(String name) {
        AccountRequest accountRequest = new AccountRequest(name);
        if (accountancyHistory.verify(accountRequest)) {
            accountRequestService.register(accountRequest);
        }
    }

    public void register(Account account) {
        // some functionality
    }

    public boolean verify(Account account) {
        // some functionality
        return false;
    }
}
