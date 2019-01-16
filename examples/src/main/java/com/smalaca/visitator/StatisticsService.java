package com.smalaca.visitator;

import com.smalaca.visitator.domain.Issue;
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
        issue.accept(history);
    }

    public Statistics generateOf(Issue issue) {
        issue.accept(producer);

        return producer.get();
    }
}
