package com.smalaca.visitator;

import com.smalaca.visitator.domain.Issue;
import com.smalaca.visitator.domain.Project;
import com.smalaca.visitator.domain.Story;
import com.smalaca.visitator.domain.Task;
import com.smalaca.visitator.statistics.domain.Statistics;
import com.smalaca.visitator.statistics.history.StatisticsHistory;
import com.smalaca.visitator.statistics.producer.StatisticsProducer;

public class StatisticsService {
    private final StatisticsHistory history;
    private final StatisticsProducer producer;

    public StatisticsService(StatisticsHistory history, StatisticsProducer producer) {
        this.history = history;
        this.producer = producer;
    }

    public void updateOf(Issue issue) {
        if (issue instanceof Task) {
            history.updateOf((Task) issue);
        } else if (issue instanceof Story) {
            history.updateOf((Story) issue);
        } else if (issue instanceof Project){
            history.updateOf((Project) issue);
        } else {
            throw new UnsupportedIssueTypeException(issue);
        }
    }

    public Statistics generateOf(Issue issue) {
        if (issue instanceof Task) {
            return producer.generateOf((Task) issue);
        } else if (issue instanceof Story) {
            return producer.generateOf((Story) issue);
        } else {
            return producer.generateOf((Project) issue);
        }
    }
}
