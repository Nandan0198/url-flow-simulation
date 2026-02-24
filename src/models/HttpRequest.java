package models;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    private String method;
    private String url;
    private Map<String, String> headers;
    private String body;
    private boolean secure;

    public HttpRequest() {
        headers = new HashMap<>();
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public boolean isSecure() {
        return secure;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}