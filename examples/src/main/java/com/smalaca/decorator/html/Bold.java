package com.smalaca.decorator.html;

public class Bold implements XmlNode {
    private final XmlNode xmlNode;

    public Bold(XmlNode xmlNode) {
        this.xmlNode = xmlNode;
    }

    @Override
    public String get() {
        return "<b>" + xmlNode.get() + "</b>";
    }
}
