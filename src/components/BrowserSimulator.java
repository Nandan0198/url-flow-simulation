package components;

import models.HttpResponse;

public class BrowserSimulator {

    public void processResponse(HttpResponse response) {

        System.out.println("[Browser] Parsing and Rendering Page...");
        response.display();
    }
}