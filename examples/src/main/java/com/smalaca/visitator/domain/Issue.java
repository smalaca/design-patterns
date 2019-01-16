package com.smalaca.visitator.domain;

public interface Issue {
    void accept(IssueVisitator visitator);
}
