package URI;
import java.net.*;


public class ResolvingRelativeURI {
    public static void main(String[] args) {
        try {
            URI uri= URI.create("");
            System.out.println(uri.getScheme());
            System.out.println(uri.getHost());
            System.out.println(uri.getPath());
            System.out.println(uri.getPort());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
