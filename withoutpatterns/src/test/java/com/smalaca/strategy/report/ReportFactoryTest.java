package com.smalaca.strategy.report;

import com.smalaca.strategy.web.Input;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

class ReportFactoryTest {
    private static final Input INPUT = mock(Input.class);
    private static final ReportParameters REPORT_PARAMETERS = mock(ReportParameters.class);
    private final ReportFactory factory = spy(new ReportFactory());

    @Test
    void shouldGeneratePdf() {
        given(factory.parse(INPUT)).willReturn(REPORT_PARAMETERS);
        given(factory.valid(REPORT_PARAMETERS)).willReturn(true);

        Report actual = factory.create(INPUT, ReportType.PDF);

        assertThat(actual.getContent()).isEqualTo("pdf");
    }

    @Test
    void shouldGenerateXml() {
        given(factory.parse(INPUT)).willReturn(REPORT_PARAMETERS);
        given(factory.valid(REPORT_PARAMETERS)).willReturn(true);

        Report actual = factory.create(INPUT, ReportType.XML);

        assertThat(actual.getContent()).isEqualTo("xml");
    }
}