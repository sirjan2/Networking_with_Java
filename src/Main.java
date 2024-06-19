import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.nepal.gov.np");
            System.out.println("Host Name:" + ip.getHostName());
            System.out.println("Ip Address:" + ip.getHostAddress());
            System.out.println("Canonical Host Name:"+ip.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}
