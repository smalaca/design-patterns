package com.smalaca.command.html;

public class BoldNode implements HtmlCommand {
    @Override
    public void process(HtmlNode htmlNode) {
        String value = "<b>" + htmlNode.value() + "</b>";
        htmlNode.change(value);
    }
}
