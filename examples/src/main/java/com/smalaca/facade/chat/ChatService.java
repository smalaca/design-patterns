package com.smalaca.facade.chat;

import com.smalaca.facade.domain.User;

public interface ChatService {
    void send(User user, String message);
}
