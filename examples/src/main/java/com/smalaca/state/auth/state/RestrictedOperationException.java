package com.smalaca.state.auth.state;

class RestrictedOperationException extends RuntimeException {
    RestrictedOperationException(String message) {
        super(message);
    }
}
