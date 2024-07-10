package URL;

import java.io.InputStream;
import java.net.URL;

public class OpenStreamDemo {
    public static void main(String[] args) {
        try {
            URL url1=new URL("https://lec.edu.np");
            InputStream is= url1.openStream();
            int c;
            while ((c=is.read())!=-1)
            {
                System.out.write(c);
            }
            is.close();
        }
        catch (Exception exception){
            System.err.println(exception.getMessage());
        }
    }
}
