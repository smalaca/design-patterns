package com.smalaca.command.html;

public class HtmlNode {
    private String value;

    public HtmlNode(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public void change(String value) {
        this.value = value;
    }
}
