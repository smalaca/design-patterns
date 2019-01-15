package com.smalaca.command;

import com.smalaca.command.html.BoldNode;
import com.smalaca.command.html.HtmlCommand;
import com.smalaca.command.html.HtmlNode;
import com.smalaca.command.html.HtmlNodeRepository;
import com.smalaca.command.html.ItalicNode;
import com.smalaca.command.html.UnderlineNode;

import java.util.ArrayList;
import java.util.List;

public class HtmlEditor {
    private final List<HtmlCommand> commands = new ArrayList<>();
    private final HtmlNodeRepository repository;
    private final HtmlNode htmlNode;

    public HtmlEditor(HtmlNode htmlNode, HtmlNodeRepository repository) {
        this.repository = repository;
        this.htmlNode = htmlNode;
    }

    public void italic() {
        commands.add(new ItalicNode());
    }

    public void bold() {
        commands.add(new BoldNode());
    }

    public void underline() {
        commands.add(new UnderlineNode());
    }

    public void rollback() {
        commands.clear();
    }

    public void save() {
        commands.forEach(command -> command.process(htmlNode));
        repository.save(htmlNode);
        commands.clear();
    }
}
