import components.*;
import models.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== URL to Website Flow Simulation ===\n");

        String testUrl = "https://www.google.com/about";

        URL url = new URL(testUrl);

        System.out.println("[Browser] Parsed URL: " + url);

        DNSResolver dns = new DNSResolver();
        String ip = dns.resolve(url.getHostname());

        if (ip == null) return;

        TCPSimulator tcp = new TCPSimulator();

        if (url.getProtocol().equals("https")) {
            tcp.establishSecureConnection(ip, url.getPort());
        } else {
            tcp.establishConnection(ip, url.getPort());
        }

        HttpRequest request = new HttpRequest();
        request.setMethod("GET");
        request.setUrl(url.getPath());
        request.setSecure(url.getProtocol().equals("https"));

        ReverseProxy proxy = new ReverseProxy();
        request = proxy.forwardRequest(request);

        WebServer server = new WebServer();
        HttpResponse response = server.handleRequest(request);

        BrowserSimulator browser = new BrowserSimulator();
        browser.processResponse(response);

        tcp.closeConnection();
    }
}