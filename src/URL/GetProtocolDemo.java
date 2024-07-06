package URL;

import java.net.URL;

public class GetProtocolDemo {
    public static void main(String[] args) {
        try{
            URL url1=new URL("http://lec.edu.np:20/gallery");
            System.out.println(url1.getProtocol());
            System.out.println(url1.getHost());
            System.out.println(url1.getFile());
            System.out.println(url1.getPort());
            System.out.println(url1.getDefaultPort());
            System.out.println(url1.getPath());
        }
        catch (Exception exp)
        {
            System.out.println(exp.getMessage());
        }

    }
}
