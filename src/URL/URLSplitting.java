package URL;

import java.net.URL;

public class URLSplitting {
    public static void main(String[] args) {
        try{
            URL url1=new URL("http://lec.edu.np:20/gallery");
            System.out.println(url1.getProtocol());
            System.out.println(url1.getHost());
            System.out.println(url1.getFile());
            System.out.println(url1.getPort());
            System.out.println(url1.getDefaultPort());
            System.out.println(url1.getPath());
            System.out.println(url1.getQuery());
            System.out.println(url1.getRef());
            String host= url1.getHost();
            if(host!=null){
                int atSign=host.indexOf('@');
                if(atSign!=-1) host=host.substring(atSign+1);
                System.out.println("The host is "+host);
            }else {
                System.out.println("The host is null");
            }

        }
        catch (Exception exp)
        {
            System.out.println(exp.getMessage());
        }

    }
}


