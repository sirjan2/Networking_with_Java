package URL;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
public class GetContentDemo {
    public static void main(String [] args) {
        try {
            URL url = new URL("https://lec.edu.np");
            Object content = url.getContent();
            InputStream is= (InputStream) content;
            //Type Cast Hannu Parxa
            int c;
            while ((c=is.read())!=-1)
            {
                System.out.write(c);
            }
            is.close();
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
