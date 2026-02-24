package components;

public class TCPSimulator {

    public void establishConnection(String ip, int port) {

        System.out.println("[TCP] Connecting to " + ip + ":" + port);
        System.out.println("[TCP] SYN");
        System.out.println("[TCP] SYN-ACK");
        System.out.println("[TCP] ACK");
        System.out.println("[TCP] Connection Established");
    }

    public void establishSecureConnection(String ip, int port) {

        establishConnection(ip, port);

        System.out.println("[TLS] Client Hello");
        System.out.println("[TLS] Server Hello + Certificate");
        System.out.println("[TLS] Key Exchange");
        System.out.println("[TLS] Secure Connection Established");
    }

    public void closeConnection() {
        System.out.println("[TCP] Connection Closed\n");
    }
}