package com.smalaca.memento.domain;

public class ProjectSnapshot {
    private final CodeBase codeBase;

    ProjectSnapshot(CodeBase codeBase) {
        this.codeBase = codeBase;
    }

    CodeBase aCodeBase() {
        return codeBase;
    }
}
