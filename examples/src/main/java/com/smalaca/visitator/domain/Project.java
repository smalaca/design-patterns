package com.smalaca.visitator.domain;

public class Project implements Issue {
    @Override
    public void accept(IssueVisitator visitator) {
        visitator.visit(this);
    }
}
