package com.smalaca.iterator.web;

import com.smalaca.iterator.domain.Host;
import com.smalaca.iterator.domain.HostGroupRepository;

import java.util.List;

public class HostsController {
    private final HostGroupRepository repository;

    public HostsController(HostGroupRepository repository) {
        this.repository = repository;
    }

    public boolean checkStatsOf(String hostGroupId) {
        List<Host> hostGroup = repository.findAll(hostGroupId);
        boolean status = false;

        for(Host host : hostGroup) {
            status = host.ping();
        }

        return status;
    }
}
