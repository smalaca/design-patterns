package com.smalaca.memento.domain;

public class Project {
    private final String name;
    private CodeBase codeBase;

    Project(String name, CodeBase codeBase) {
        this.name = name;
        this.codeBase = codeBase;
    }

    public ProjectSnapshot snapshot() {
        return new ProjectSnapshot(codeBase.deepCopy());
    }

    public void apply(ProjectSnapshot projectSnapshot) {
       codeBase = projectSnapshot.aCodeBase();
    }
}
