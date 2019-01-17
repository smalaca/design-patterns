package com.smalaca.visitator;

import com.smalaca.visitator.domain.Issue;

class UnsupportedIssueTypeException extends RuntimeException {
    UnsupportedIssueTypeException(Issue issue) {
    }
}
