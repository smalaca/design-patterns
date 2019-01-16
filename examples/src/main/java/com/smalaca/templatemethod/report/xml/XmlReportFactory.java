package com.smalaca.templatemethod.report.xml;

import com.smalaca.templatemethod.report.ReportContent;
import com.smalaca.templatemethod.report.ReportFactoryTemplate;
import com.smalaca.templatemethod.report.ReportFooter;
import com.smalaca.templatemethod.report.ReportHeader;
import com.smalaca.templatemethod.report.ReportParameters;

public class XmlReportFactory extends ReportFactoryTemplate {
    @Override
    protected ReportFooter generateFooter(ReportParameters reportParameters) {
        return null;
    }

    @Override
    protected ReportContent generateContent(ReportParameters reportParameters) {
        return null;
    }

    @Override
    protected ReportHeader generateHeader(ReportParameters reportParameters) {
        return null;
    }
}
