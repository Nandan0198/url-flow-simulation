package models;

public class URL {

    private String protocol;
    private String hostname;
    private String path;
    private int port;

    public URL(String urlString) {
        parseURL(urlString);
    }

    private void parseURL(String url) {

        if (url.startsWith("https://")) {
            this.protocol = "https";
            this.port = 443;
            url = url.substring(8);
        } else if (url.startsWith("http://")) {
            this.protocol = "http";
            this.port = 80;
            url = url.substring(7);
        } else {
            throw new IllegalArgumentException("Invalid protocol!");
        }

        String[] parts = url.split("/", 2);
        this.hostname = parts[0];
        this.path = parts.length > 1 ? "/" + parts[1] : "/";
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHostname() {
        return hostname;
    }

    public String getPath() {
        return path;
    }

    public int getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "Protocol=" + protocol +
                ", Host=" + hostname +
                ", Path=" + path +
                ", Port=" + port;
    }
}