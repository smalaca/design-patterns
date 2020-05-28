package com.smalaca.templatemethod.report;

class ReportBuilder {
    private ReportHeader header;
    private ReportContent content;
    private ReportFooter footer;
    private ReportSignature signature;

    public ReportBuilder with(ReportHeader header) {
        this.header = header;
        return this;
    }

    public ReportBuilder with(ReportContent content) {
        this.content = content;
        return this;
    }

    public ReportBuilder with(ReportFooter footer) {
        this.footer = footer;
        return this;
    }

    public ReportBuilder with(ReportSignature signature) {
        this.signature = signature;
        return this;
    }

    public Report build() {
        return new Report(header, content, footer, signature);
    }
}
