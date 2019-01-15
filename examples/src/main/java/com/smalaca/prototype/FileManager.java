package com.smalaca.prototype;

import com.google.common.collect.ImmutableMap;
import com.smalaca.prototype.domain.File;
import com.smalaca.prototype.domain.Folder;
import com.smalaca.prototype.domain.Node;
import com.smalaca.prototype.domain.NodeType;

import java.util.Map;

public class FileManager {
    private final Map<NodeType, Node> templates = ImmutableMap.of(
            NodeType.FILE, new File("New File"),
            NodeType.FOLDER, new Folder("New Folder")
    );

    public Node createNew(NodeType type) {
        return templates.get(type).clone();
    }

    // more functionality
}
