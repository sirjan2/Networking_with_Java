import java.io.*;
import java.net.*;

public class Lab3 {
    public static void main(String[] args) {
        try {
            // To get and print InetAddress of Local Host
            InetAddress address1 = InetAddress.getLocalHost();
            System.out.println("InetAddress of Local Host: " + address1);

            // To get and print InetAddress of Named Host
            InetAddress address2 = InetAddress.getByName("45.22.30.39");
            System.out.println("InetAddress of Named Host: " + address2);

            // To get and print ALL InetAddresses of Named Host
            InetAddress[] address3 = InetAddress.getAllByName("172.19.25.29");
            for (InetAddress addr : address3) {
                System.out.println("ALL InetAddresses of Named Host: " + addr);
            }

            // To get and print InetAddresses of Host with specified IP Address
            byte[] IPAddress = {125, 0, 0, 1};
            InetAddress address4 = InetAddress.getByAddress(IPAddress);
            System.out.println("InetAddresses of Host with specified IP Address: " + address4);

            // To get and print InetAddresses of Host with specified IP Address and hostname
            byte[] IPAddress2 = {105, 22, (byte) 223, (byte) 186};
            InetAddress address5 = InetAddress.getByAddress("gfg.com", IPAddress2);
            System.out.println("InetAddresses of Host with specified IP Address and hostname: " + address5);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}