package com.smalaca.strategy.web;

import com.google.common.collect.ImmutableMap;
import com.smalaca.strategy.report.Report;
import com.smalaca.strategy.report.ReportFactory;
import com.smalaca.strategy.report.ReportStrategy;
import com.smalaca.strategy.report.ReportType;
import com.smalaca.strategy.report.pdf.PdfReportStrategy;
import com.smalaca.strategy.report.xml.XmlReportStrategy;

import java.util.Map;

public class ReportController {
    private final Map<ReportType, ReportStrategy> strategies = ImmutableMap.of(
            ReportType.PDF, new PdfReportStrategy(),
            ReportType.XML, new XmlReportStrategy()
    );
    private final ReportFactory factory;

    public ReportController(ReportFactory factory) {
        this.factory = factory;
    }

    public Report generate(Input input, ReportType type) {
        ReportStrategy strategy = strategies.get(type);
        Report report = factory.create(input, strategy);

        return report;
    }
}
