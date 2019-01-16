package com.smalaca.state.auth.state;

import com.smalaca.state.auth.Credentials;
import com.smalaca.state.auth.Password;

public class BlockedUser implements UserState {
    @Override
    public void modifyPassword(Credentials credentials, Password password) {
        throw new RestrictedOperationException("Blocked users cannot change their password.");
    }

    @Override
    public void modifyLogin(Credentials credentials, String login) {
        throw new RestrictedOperationException("Blocked users cannot change their login.");
    }
}
