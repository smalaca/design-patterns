package com.smalaca.templatemethod.report;

import com.smalaca.templatemethod.web.Input;

public interface ReportFactory {
    Report create(Input input);
}
