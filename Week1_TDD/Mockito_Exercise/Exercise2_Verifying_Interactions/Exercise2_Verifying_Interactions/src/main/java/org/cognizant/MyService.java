package org.cognizant;

public class MyService {
    private ExternalAPI externalApi;

    public MyService(ExternalAPI externalApi) {
        this.externalApi = externalApi;
    }
    public String fetchData() {
        return externalApi.getData();
    }
}