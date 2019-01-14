package com.smalaca.decorator.html;

public class Italic implements XmlNode {
    private final XmlNode xmlNode;

    public Italic(XmlNode xmlNode) {
        this.xmlNode = xmlNode;
    }

    @Override
    public String get() {
        return "<i>" + xmlNode.get() + "</i>";
    }
}
