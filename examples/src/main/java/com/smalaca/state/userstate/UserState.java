package com.smalaca.state.userstate;

import com.smalaca.state.Credentials;
import com.smalaca.state.Password;

public interface UserState {
    void modifyPassword(Credentials credentials, Password password);

    void modifyLogin(Credentials credentials, String login);
}
