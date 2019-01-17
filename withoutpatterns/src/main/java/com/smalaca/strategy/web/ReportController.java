package com.smalaca.strategy.web;

import com.smalaca.strategy.report.Report;
import com.smalaca.strategy.report.ReportFactory;
import com.smalaca.strategy.report.ReportType;

public class ReportController {
    private final ReportFactory factory;

    public ReportController(ReportFactory factory) {
        this.factory = factory;
    }

    public Report generate(Input input, ReportType type) {
        Report report = factory.create(input, type);

        return report;
    }
}
