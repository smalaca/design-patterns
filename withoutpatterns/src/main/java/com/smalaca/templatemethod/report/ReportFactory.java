package com.smalaca.templatemethod.report;

import com.smalaca.templatemethod.web.Input;

public class ReportFactory {
    public Report create(Input input, ReportType type) {
        ReportParameters reportParameters = parse(input);

        if (valid(reportParameters)) {
            ReportHeader header = generateHeader(reportParameters, type);
            ReportContent content = generateContent(reportParameters, type);
            ReportFooter footer = generateFooter(reportParameters,type);
            ReportSignature signature = generateSignature();

            return new ReportBuilder()
                    .with(header)
                    .with(content)
                    .with(footer)
                    .with(signature)
                    .build();
        }

        throw new InvalidReportParametersGivenException();
    }

    private ReportSignature generateSignature() {
        return null;
    }

    private ReportFooter generateFooter(ReportParameters reportParameters, ReportType type) {
        switch (type) {
            case XML:
                return generateXmlFooter(reportParameters);
            case PDF:
                return generatePdfFooter(reportParameters);
            default:
                throw new UnsupportedReportTypeException(type);
        }
    }

    private ReportFooter generateXmlFooter(ReportParameters reportParameters) {
        return null;
    }

    private ReportFooter generatePdfFooter(ReportParameters reportParameters) {
        return null;
    }

    private ReportContent generateContent(ReportParameters reportParameters, ReportType type) {
        switch (type) {
            case XML:
                return generateXmlContent(reportParameters);
            case PDF:
                return generatePdfContent(reportParameters);
            default:
                throw new UnsupportedReportTypeException(type);
        }
    }

    private ReportContent generateXmlContent(ReportParameters reportParameters) {
        return null;
    }

    private ReportContent generatePdfContent(ReportParameters reportParameters) {
        return null;
    }

    private ReportHeader generateHeader(ReportParameters reportParameters, ReportType type) {
        switch (type) {
            case XML:
                return generateXmlHeader(reportParameters);
            case PDF:
                return generatePdfHeader(reportParameters);
            default:
                throw new UnsupportedReportTypeException(type);
        }
    }

    private ReportHeader generateXmlHeader(ReportParameters reportParameters) {
        return null;
    }

    private ReportHeader generatePdfHeader(ReportParameters reportParameters) {
        return null;
    }

    private boolean valid(ReportParameters reportParameters) {
        return false;
    }

    private ReportParameters parse(Input input) {
        return null;
    }
}
