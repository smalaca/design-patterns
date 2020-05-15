package com.smalaca.observer.web;

import com.smalaca.observer.auth.AuthResult;

public interface AuthenticationFailureObserver {
    void notifyAboutThirdFailure(AuthResult result);
}
