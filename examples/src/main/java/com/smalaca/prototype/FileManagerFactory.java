package com.smalaca.prototype;

import com.google.common.collect.ImmutableMap;
import com.smalaca.prototype.domain.NodeType;
import com.smalaca.prototype.domain.NodesFactory;

public class FileManagerFactory {
    public FileManager create() {
        NodesFactory nodesFactory = new NodesFactory();

        return new FileManager(ImmutableMap.of(
                NodeType.FILE, nodesFactory.templateFile(),
                NodeType.FOLDER, nodesFactory.templateFolder()
        ));
    }
}
