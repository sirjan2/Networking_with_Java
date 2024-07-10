package URI;
import java.net.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URIEncoding {
    public static void main(String[] args) {
        try {


            String baseurl = "htttps://www.lec.edu.np/?q=";
            String query = "info@gmail for bca";
            System.out.println("URl without encoding");
            String url = ((baseurl + query));
            System.out.println(url);
            String encodeURL= URLEncoder.encode(url, StandardCharsets.UTF_8);
            System.out.println(encodeURL);
            String decodeURL= URLDecoder.decode(url, StandardCharsets.UTF_8);
            System.out.println(decodeURL);


        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
