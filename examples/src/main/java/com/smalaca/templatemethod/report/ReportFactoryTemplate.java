package com.smalaca.templatemethod.report;

import com.smalaca.templatemethod.web.Input;

public abstract class ReportFactoryTemplate implements ReportFactory {
    @Override
    public Report create(Input input) {
        ReportParameters reportParameters = parse(input);

        if (valid(reportParameters)) {
            ReportHeader header = generateHeader(reportParameters);
            ReportContent content = generateContent(reportParameters);
            ReportFooter footer = generateFooter(reportParameters);
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

    protected abstract ReportFooter generateFooter(ReportParameters reportParameters);

    protected abstract ReportContent generateContent(ReportParameters reportParameters);

    protected abstract ReportHeader generateHeader(ReportParameters reportParameters);

    private boolean valid(ReportParameters reportParameters) {
        return false;
    }

    private ReportParameters parse(Input input) {
        return null;
    }
}
