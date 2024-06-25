import java.net.InetAddress;
import java.net.UnknownHostException;

public class Lab4 {
    public static boolean isSpam(String ipAddress) {
        String blacklistDomain = "zen.spamhaus.org";
        String[] octets = ipAddress.split("\\.");

        if (octets.length != 4) {
            System.out.println("Invalid IP address format.");
            return false;
        }

        // Reverse the order of the IP address segments
        String query = octets[3] + "." + octets[2] + "." + octets[1] + "." + octets[0] + "." + blacklistDomain;
        System.out.println(query);
        try {
            // Perform a DNS lookup on the query string
            InetAddress address = InetAddress.getByName(query);
            // Return true if the IP address is listed in the blacklist
            return "127.0.0.2".equals(address.getHostAddress()) ||
                    "127.0.0.3".equals(address.getHostAddress()) ||
                    "127.0.0.4".equals(address.getHostAddress());
        } catch (UnknownHostException ex) {
            // The DNS lookup failed, so assume the IP address is not listed
            System.out.println("DNS lookup failed: " + ex.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        String ipAddress = "107.172.209.246";
        boolean isSpam = isSpam(ipAddress);
        System.out.println("Is spam: " + isSpam);
    }
}
