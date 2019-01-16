package com.smalaca.strategy.report;

import com.smalaca.strategy.web.Input;

public class ReportFactory {
    public Report create(Input input, ReportStrategy strategy) {
        ReportParameters reportParameters = parse(input);

        if (valid(reportParameters)) {
            return strategy.generate(reportParameters);
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
