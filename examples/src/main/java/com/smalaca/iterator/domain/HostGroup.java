package com.smalaca.iterator.domain;

import java.util.Iterator;
import java.util.List;

public class HostGroup implements Iterable<Host> {
    private final List<Host> hosts;

    public HostGroup(List<Host> hosts) {
        this.hosts = hosts;
    }

    @Override
    public Iterator<Host> iterator() {
        return hosts.iterator();
    }
}
