import java.net.*;
import java.io.*;

public class URLs {
    public static void main(String[] args)throws Exception {
        URL url = new URL("https://lec.edu.np/");
        URLConnection connection = url.openConnection();
        InputStream raw = connection.getInputStream();
        InputStream buffer = new BufferedInputStream(raw);
        Reader reader = new InputStreamReader(buffer);
        int c;
        while ((c = reader.read()) != -1) {
            System.out.print((char) c);
        }
        reader.close();
    }
}

