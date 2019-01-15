package com.smalaca.command.html;

public class ItalicNode implements HtmlCommand {
    @Override
    public void process(HtmlNode htmlNode) {
        String value = "<i>" + htmlNode.value() + "</i>";
        htmlNode.change(value);
    }
}
