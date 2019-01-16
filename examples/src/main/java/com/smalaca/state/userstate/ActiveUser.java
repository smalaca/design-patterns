package com.smalaca.state.userstate;

import com.smalaca.state.Credentials;
import com.smalaca.state.Password;

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
