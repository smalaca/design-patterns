package com.smalaca.decorator;

import com.smalaca.decorator.html.Bold;
import com.smalaca.decorator.html.Italic;
import com.smalaca.decorator.html.Letter;
import com.smalaca.decorator.html.Underline;
import com.smalaca.decorator.html.UnsupportedXmlNodeTypeException;
import com.smalaca.decorator.html.XmlNode;
import com.smalaca.decorator.html.XmlNodeType;

public class HtmlTextEditor {
    public XmlNode letter(String letter) {
        return new Letter(letter);
    }

    public XmlNode enrich(XmlNodeType type, XmlNode node) {
        switch (type) {
            case ITALIC:
                return new Italic(node);
            case BOLD:
                return new Bold(node);
            case UNDERLINE:
                return new Underline(node);
            default:
                throw new UnsupportedXmlNodeTypeException(type);
        }
    }
}
