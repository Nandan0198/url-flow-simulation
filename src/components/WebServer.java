package components;

import models.HttpRequest;
import models.HttpResponse;

import java.util.HashMap;
import java.util.Map;

public class WebServer {

    private Map<String, String> routes;

    public WebServer() {
        routes = new HashMap<>();
        routes.put("/", "<h1>Welcome Home</h1>");
        routes.put("/about", "<h1>About Page</h1>");
        routes.put("/api/data", "{\"status\":\"success\"}");
    }

    public HttpResponse handleRequest(HttpRequest request) {

        System.out.println("[Web Server] Processing " + request.getUrl());

        HttpResponse response = new HttpResponse();

        String body = routes.get(request.getUrl());

        if (body != null) {
            response.setStatusCode(200);
            response.setStatusMessage("OK");
            response.setBody(body);
        } else {
            response.setStatusCode(404);
            response.setStatusMessage("Not Found");
            response.setBody("<h1>404 Page Not Found</h1>");
        }

        return response;
    }
}