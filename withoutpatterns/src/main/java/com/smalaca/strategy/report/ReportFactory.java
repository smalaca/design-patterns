package com.smalaca.strategy.report;

import com.smalaca.strategy.web.Input;

public class ReportFactory {
    public Report create(Input input, ReportType type) {
        ReportParameters reportParameters = parse(input);

        if (valid(reportParameters)) {
            switch (type) {
                case XML:
                    return xmlReport();
                case PDF:
                    return pdfReport();
                default:
                    throw new UnsupportedReportTypeException(type);
            }
        }

        throw new InvalidReportParametersGivenException();
    }

    private Report xmlReport() {
        return new Report("xml");
    }

    private Report pdfReport() {
        return new Report("pdf");
    }

    @Deprecated
    boolean valid(ReportParameters reportParameters) {
        return false;
    }

    @Deprecated
    ReportParameters parse(Input input) {
        return null;
    }
}
