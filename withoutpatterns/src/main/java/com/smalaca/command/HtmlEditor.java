package com.smalaca.command;

import com.smalaca.command.html.HtmlChange;
import com.smalaca.command.html.HtmlNode;
import com.smalaca.command.html.HtmlNodeRepository;

import java.util.ArrayList;
import java.util.List;

import static com.smalaca.command.html.HtmlChange.BOLD;
import static com.smalaca.command.html.HtmlChange.ITALIC;
import static com.smalaca.command.html.HtmlChange.UNDERLINE;

public class HtmlEditor {
    private final List<HtmlChange> changes = new ArrayList<>();
    private final HtmlNodeRepository repository;
    private final HtmlNode htmlNode;

    public HtmlEditor(HtmlNode htmlNode, HtmlNodeRepository repository) {
        this.repository = repository;
        this.htmlNode = htmlNode;
    }

    public void italic() {
        changes.add(ITALIC);
    }

    public void bold() {
        changes.add(BOLD);
    }

    public void underline() {
        changes.add(UNDERLINE);
    }

    public void rollback() {
        changes.clear();
    }

    public void save() {
        for (HtmlChange change : changes) {
            String value = htmlNode.value();

            switch (change) {
                case ITALIC:
                    value = "<i>" + value + "</i>";
                    break;
                case BOLD:
                    value = "<b>" + value + "</b>";
                    break;
                case UNDERLINE:
                    value = "<u>" + value + "</u>";
                    break;
            }

            htmlNode.change(value);
        }

        repository.save(htmlNode);
        changes.clear();
    }
}
