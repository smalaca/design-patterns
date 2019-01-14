package com.smalaca.prototype;

import com.smalaca.prototype.domain.File;
import com.smalaca.prototype.domain.Folder;
import com.smalaca.prototype.domain.Node;
import com.smalaca.prototype.domain.NodeType;
import com.smalaca.prototype.domain.exception.UnsupportedNodeException;

public class FileManager {

    public Node createNew(NodeType type) {
        switch (type) {
            case FILE:
                return new File("New File");
            case FOLDER:
                return new Folder("New Folder");
        }

        throw new UnsupportedNodeException(type);
    }

    // more functionality
}
