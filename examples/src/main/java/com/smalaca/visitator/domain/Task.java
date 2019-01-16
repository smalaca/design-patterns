package com.smalaca.visitator.domain;

public class Task implements Issue {
    @Override
    public void accept(IssueVisitator visitator) {
        visitator.visit(this);
    }
}
