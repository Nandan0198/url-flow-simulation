package models;

import java.util.HashMap;
import java.util.Map;

public class HttpResponse {

    private int statusCode;
    private String statusMessage;
    private Map<String, String> headers;
    private String body;

    public HttpResponse() {
        headers = new HashMap<>();
    }

    public void setStatusCode(int code) {
        this.statusCode = code;
    }

    public void setStatusMessage(String message) {
        this.statusMessage = message;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void display() {
        System.out.println("HTTP/1.1 " + statusCode + " " + statusMessage);
        for (Map.Entry<String, String> header : headers.entrySet()) {
            System.out.println(header.getKey() + ": " + header.getValue());
        }
        System.out.println("\nBody: " + body);
    }
}