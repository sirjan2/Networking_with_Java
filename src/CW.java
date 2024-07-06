//WAP to check ip address , Host Name and MAC address.


import java.net.*;

public class CW {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("192.168.101.17");
            NetworkInterface ni = NetworkInterface.getByInetAddress(ip);
            byte[] macBytes = ni.getHardwareAddress();

            // Directly format and print the MAC address without using loops or StringBuilder
            System.out.printf("MAC Address: %02X-%02X-%02X-%02X-%02X-%02X\n",
                    macBytes[0], macBytes[1], macBytes[2],
                    macBytes[3], macBytes[4], macBytes[5]);

            // Print the host name and IP address
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (SocketException | UnknownHostException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
