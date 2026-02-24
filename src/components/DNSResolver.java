package components;

import java.util.HashMap;
import java.util.Map;

public class DNSResolver {

    private Map<String, String> dnsCache;
    private Map<String, String> dnsRecords;

    public DNSResolver() {
        dnsCache = new HashMap<>();
        dnsRecords = new HashMap<>();

        dnsRecords.put("www.example.com", "93.184.216.34");
        dnsRecords.put("www.google.com", "142.250.183.206");
        dnsRecords.put("localhost", "127.0.0.1");
    }

    public String resolve(String hostname) {

        System.out.println("[DNS] Resolving: " + hostname);

        if (dnsCache.containsKey(hostname)) {
            System.out.println("[DNS] Cache hit!");
            return dnsCache.get(hostname);
        }

        System.out.println("[DNS] Cache miss. Performing lookup...");

        String ip = dnsRecords.get(hostname);

        if (ip != null) {
            dnsCache.put(hostname, ip);
            System.out.println("[DNS] Resolved to: " + ip);
            return ip;
        } else {
            System.out.println("[DNS] Host not found!");
            return null;
        }
    }
}