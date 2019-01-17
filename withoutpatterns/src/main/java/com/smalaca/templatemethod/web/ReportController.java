package com.smalaca.templatemethod.web;

import com.smalaca.templatemethod.report.Report;
import com.smalaca.templatemethod.report.ReportFactory;
import com.smalaca.templatemethod.report.ReportType;

public class ReportController {
    private final ReportFactory reportFactory;

    public ReportController(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;
    }

    public Report generate(Input input, ReportType type) {
        return reportFactory.create(input, type);
    }
}
