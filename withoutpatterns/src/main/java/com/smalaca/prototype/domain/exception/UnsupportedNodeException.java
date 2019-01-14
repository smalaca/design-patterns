package com.smalaca.prototype.domain.exception;

import com.smalaca.prototype.domain.NodeType;

public class UnsupportedNodeException extends RuntimeException {
    public UnsupportedNodeException(NodeType type) {
    }
}
