package com.smalaca.state.auth.state;

import com.smalaca.state.auth.Credentials;
import com.smalaca.state.auth.Password;

public interface UserState {
    void modifyPassword(Credentials credentials, Password password);

    void modifyLogin(Credentials credentials, String login);
}
