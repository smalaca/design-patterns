package com.smalaca.visitator.statistics.producer;

import com.smalaca.visitator.domain.IssueVisitator;
import com.smalaca.visitator.domain.Project;
import com.smalaca.visitator.domain.Story;
import com.smalaca.visitator.domain.Task;
import com.smalaca.visitator.statistics.domain.Statistics;

public class StatisticsProducer implements IssueVisitator {
    private Statistics statistics;

    public Statistics get() {
        return statistics;
    }

    @Override
    public void visit(Task task) {
        statistics = generateOf(task);
    }

    private Statistics generateOf(Task task) {
        return null;
    }

    @Override
    public void visit(Story story) {
        statistics = generateOf(story);
    }

    private Statistics generateOf(Story story) {
        return null;
    }

    @Override
    public void visit(Project project) {
        statistics = generateOf(project);
    }

    private Statistics generateOf(Project project) {
        return null;
    }
}
