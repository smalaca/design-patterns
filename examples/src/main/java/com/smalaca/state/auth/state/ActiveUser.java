package com.smalaca.state.auth.state;

import com.smalaca.state.auth.Credentials;
import com.smalaca.state.auth.Password;

public class ActiveUser implements UserState {
    @Override
    public void modifyPassword(Credentials credentials, Password password) {
        credentials.change(password);
    }

    @Override
    public void modifyLogin(Credentials credentials, String login) {
        credentials.change(login);
    }
}
