package com.smalaca.memento.domain;

public class Project {
    private final String name;
    private CodeBase codeBase;

    Project(String name, CodeBase codeBase) {
        this.name = name;
        this.codeBase = codeBase;
    }

    public void setCodeBase(CodeBase codeBase) {
       this.codeBase = codeBase;
    }

    public CodeBase getCodeBase() {
        return codeBase;
    }
}
