import java.net.*;


public class URLs_resolving {


    public static void main(String[] args) throws MalformedURLException {
        String baseURLStr="https://lec.edu.np/uploads/gallery/69ecbccc886384e7fb1d1d517c0638bc478e95f1.jpg";
        String relativeUrls="69ecbccc886384e7fb1d1d517c0638bc478e95f1.jpg";
        URL baseURL=new URL(baseURLStr);
        URL resolvedRelativeURL=new URL(baseURL,relativeUrls);
        System.out.println(baseURL);
        System.out.println(resolvedRelativeURL);
    }

}
