package com.smalaca.templatemethod.report;

public class Report {
    private final ReportHeader header;
    private final ReportContent content;
    private final ReportFooter footer;
    private final ReportSignature signature;

    Report(ReportHeader header, ReportContent content, ReportFooter footer, ReportSignature signature) {
        this.header = header;
        this.content = content;
        this.footer = footer;
        this.signature = signature;
    }

    public String read() {
        return header.value() + ": " +
                content.value() + ": " +
                footer.value() + ": " +
                signature.value();
    }
}
