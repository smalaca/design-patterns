package com.smalaca.command.html;

public class UnderlineNode implements com.smalaca.command.html.HtmlCommand {
    @Override
    public void process(HtmlNode htmlNode) {
        String value = "<u>" + htmlNode.value() + "</u>";
        htmlNode.change(value);
    }
}
