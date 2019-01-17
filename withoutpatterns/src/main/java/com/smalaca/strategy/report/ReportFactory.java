package com.smalaca.strategy.report;

import com.smalaca.strategy.web.Input;

public class ReportFactory {
    public Report create(Input input, ReportType type) {
        ReportParameters reportParameters = parse(input);

        if (valid(reportParameters)) {
            switch (type) {
                case XML:
                    break;
                case PDF:
                    break;
                default:
                    throw new UnsupportedReportTypeException(type);
            }
        }

        throw new InvalidReportParametersGivenException();
    }

    private boolean valid(ReportParameters reportParameters) {
        return false;
    }

    private ReportParameters parse(Input input) {
        return null;
    }
}
