package com.smalaca.templatemethod.web;

import com.google.common.collect.ImmutableMap;
import com.smalaca.templatemethod.report.Report;
import com.smalaca.templatemethod.report.ReportFactory;
import com.smalaca.templatemethod.report.ReportType;
import com.smalaca.templatemethod.report.pdf.PdfReportFactory;
import com.smalaca.templatemethod.report.xml.XmlReportFactory;

import java.util.Map;

public class ReportController {
    private final Map<ReportType, ReportFactory> factories = ImmutableMap.of(
            ReportType.PDF, new PdfReportFactory(),
            ReportType.XML, new XmlReportFactory()
    );

    public Report generate(Input input, ReportType type) {
        ReportFactory reportFactory = factories.get(type);

        return reportFactory.create(input);
    }
}
