package com.smalaca.decorator.html;

public class Underline implements XmlNode {
    private final XmlNode xmlNode;

    public Underline(XmlNode xmlNode) {
        this.xmlNode = xmlNode;
    }

    @Override
    public String get() {
        return "<u>" + xmlNode.get() + "</u>";
    }
}
