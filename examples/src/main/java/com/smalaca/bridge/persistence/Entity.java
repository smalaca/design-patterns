package com.smalaca.bridge.persistence;

public interface Entity {
    <T extends Id> T id();
}
