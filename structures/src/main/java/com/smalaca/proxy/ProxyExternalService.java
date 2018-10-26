package com.smalaca.proxy;

public class ProxyExternalService implements ExternalService {
    private ExternalService externalService;

    @Override
    public void doSomething() {
        if (isRealCallRequired()) {
            anExternalService().doSomething();
        }
    }

    private boolean isRealCallRequired() {
        return false;
    }

    private ExternalService anExternalService() {
        if (externalService == null) {
            externalService = new RealExternalService();
        }

        return externalService;
    }
}
