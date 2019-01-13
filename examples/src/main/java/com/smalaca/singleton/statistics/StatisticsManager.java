package com.smalaca.singleton.statistics;

import com.smalaca.singleton.application.config.ApplicationConfiguration;
import com.smalaca.singleton.application.request.Input;

public class StatisticsManager {
    private StatisticsService statisticsService;

    public void process(Input input) {
        StatisticsService statisticsService = aStatisticsService();

        // some functionality
    }

    private StatisticsService aStatisticsService() {
        if(statisticsService == null) {
            ApplicationConfiguration configuration = ApplicationConfiguration.anInstance();

            statisticsService = new StatisticsService(
                    configuration.aLogin(), configuration.aPassword(),
                    configuration.aServerAddress("http.statistics")
            );

            statisticsService.connect();
        }

        return statisticsService;
    }
}
