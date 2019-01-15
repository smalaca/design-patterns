package com.smalaca.chainofresponsibility.domain;

public interface UserRepository {
    User findBy(String userId);
}
