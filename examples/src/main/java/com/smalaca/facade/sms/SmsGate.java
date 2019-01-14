package com.smalaca.facade.sms;

import com.smalaca.facade.domain.PhoneNumber;

public interface SmsGate {
    void send(PhoneNumber phoneNumber, String value);
}
