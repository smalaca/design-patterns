package com.smalaca.mediator.usermanagement;

import com.smalaca.mediator.Mediator;

public class AccountService {
    private final Mediator mediator;
    private final AccountRequestService accountRequestService;

    public AccountService(Mediator mediator, AccountRequestService accountRequestService) {
        this.mediator = mediator;
        this.accountRequestService = accountRequestService;
    }

    public void createReuqest(String name) {
        AccountRequest accountRequest = new AccountRequest(name);
        if (mediator.isAcceptable(accountRequest)) {
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
