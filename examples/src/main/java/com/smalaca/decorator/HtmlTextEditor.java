package com.smalaca.decorator;

import com.google.common.collect.ImmutableMap;
import com.smalaca.decorator.html.Bold;
import com.smalaca.decorator.html.Italic;
import com.smalaca.decorator.html.Letter;
import com.smalaca.decorator.html.Underline;
import com.smalaca.decorator.html.XmlNode;
import com.smalaca.decorator.html.XmlNodeType;

import java.util.Map;
import java.util.function.Function;

public class HtmlTextEditor {
    private final Map<XmlNodeType, Function<XmlNode, XmlNode>> xmlNodes = ImmutableMap.of(
        XmlNodeType.ITALIC, Italic::new,
        XmlNodeType.BOLD, Bold::new,
        XmlNodeType.UNDERLINE, Underline::new
    );

    public XmlNode letter(String letter) {
        return new Letter(letter);
    }

    public XmlNode enrich(XmlNodeType type, XmlNode node) {
        return xmlNodes.get(type).apply(node);
    }
}
