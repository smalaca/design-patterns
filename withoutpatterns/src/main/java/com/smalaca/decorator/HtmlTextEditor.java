package com.smalaca.decorator;

import com.smalaca.decorator.html.XmlNodeType;

public class HtmlTextEditor {
    public String letter(String letter) {
        return letter;
    }

    public String enrich(XmlNodeType type, String value) {
        switch (type) {
            case ITALIC:
                return "<i>" + value + "</i>";

            case BOLD:
                return "<b>" + value + "</b>";

            case UNDERLINE:
                return "<u>" + value + "</u>";

            default:
                return value;
        }
    }
}
