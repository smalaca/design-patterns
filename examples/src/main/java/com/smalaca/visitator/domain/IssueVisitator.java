package com.smalaca.visitator.domain;

public interface IssueVisitator {
    void visit(Task task);

    void visit(Story story);

    void visit(Project project);
}
