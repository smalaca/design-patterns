package com.smalaca.prototype;

import com.smalaca.prototype.domain.Node;
import com.smalaca.prototype.domain.NodeType;

import java.util.Map;

public class FileManager {
    private final Map<NodeType, Node> templates;

    FileManager(Map<NodeType, Node> templates) {
        this.templates = templates;
    }

    public Node createNew(NodeType type) {
        return templates.get(type).clone();
    }

    // more functionality
}
