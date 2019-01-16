package com.smalaca.visitator.domain;

public class Story implements Issue {
    @Override
    public void accept(IssueVisitator visitator) {
        visitator.visit(this);
    }
}
