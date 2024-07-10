package URL;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class OpenConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url1=new URL("https://lec.edu.np");
            URLConnection ucon= url1.openConnection();
            InputStream is= ucon.getInputStream();
            int c;
            while ((c=is.read())!=-1)
            {
                System.out.write(c);
            }
            is.close();

        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
