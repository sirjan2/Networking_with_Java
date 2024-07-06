package URL;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class BufferReaderDemo {
    public static void main(String[] args) {
        try {
            // Initialize URL and open connection
            URL url1 = new URL("https://lec.edu.np");
            URLConnection ucon = url1.openConnection();

            // Get the input stream from the connection
            InputStream inputStream = ucon.getInputStream();

            // Use BufferedReader to read from the input stream
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            // StringBuilder to accumulate the content
            StringBuilder content = new StringBuilder();
            String line;

            // Read each line from the bufferedReader and append to content
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Close the BufferedReader
            bufferedReader.close();

            // Print the content
            System.out.println(content.toString());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
