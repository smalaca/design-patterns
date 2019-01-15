package com.smalaca.iterator.web;

import com.smalaca.iterator.domain.Host;
import com.smalaca.iterator.domain.HostGroup;
import com.smalaca.iterator.domain.HostGroupRepository;

public class HostsController {
    private final HostGroupRepository repository;

    public HostsController(HostGroupRepository repository) {
        this.repository = repository;
    }

    public boolean checkStatsOf(String hostGroupId) {
        HostGroup hostGroup = repository.findBy(hostGroupId);
        boolean status = false;

        for(Host host : hostGroup) {
            status = host.ping();
        }

        return status;
    }
}
