import java.io.*;
import java.net.*;



public class Day2 {
    public static void main(String[]args)
    {
        try{
//Get the Inet6Address object for a given IP address string
            Inet6Address ip=(Inet6Address)Inet6Address.getByName("fe80::3a69:8bee:8845:a5c6%15");
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
        }catch(Exception e){System.out.println(e);}

        try{
//Get the Inet4Address object for a given IP address string
            Inet4Address ip=(Inet4Address)Inet4Address.getByName("192.168.100.232");
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
        }catch(Exception e){System.out.println(e);}

    }

}


