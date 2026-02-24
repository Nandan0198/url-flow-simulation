package components;

import models.HttpRequest;

public class ReverseProxy {

    public HttpRequest forwardRequest(HttpRequest request) {

        System.out.println("[Reverse Proxy] Received request: " + request.getUrl());

        if (request.isSecure()) {
            System.out.println("[Reverse Proxy] SSL Termination performed");
            request.setSecure(false);
        }

        System.out.println("[Reverse Proxy] Forwarding to backend server");

        request.addHeader("X-Forwarded-For", "Client-IP");
        return request;
    }
}