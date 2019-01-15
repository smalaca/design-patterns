package com.smalaca.iterator.domain;

import java.util.List;

public interface HostGroupRepository {
    List<Host> findAll(String hostGroupId);
}
