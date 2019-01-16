package com.smalaca.observer.auth;

import com.smalaca.observer.security.Password;

public interface AuthenticationService {
    AuthResult login(String name, Password password);
}
