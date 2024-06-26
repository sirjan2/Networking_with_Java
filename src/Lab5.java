import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {
        String file = "C:\\Users\\Admin\\IdeaProjects\\Networking with Java\\src\\log.txt";

        try (
                FileInputStream fin = new FileInputStream(file);
                Scanner scanner = new Scanner(fin)
        ) {
            // Read each line of the log file
            while (scanner.hasNextLine()) {
                String entry = scanner.nextLine();

                // Separate out the IP address
                int index = entry.indexOf(' '); // Position of the first space
                if (index == -1) {
                    System.err.println("Invalid log entry: " + entry);
                    continue;
                }

                String ip = entry.substring(0, index); // Extract IP address
                String theRest = entry.substring(index); // The rest of the log entry

                // Ask DNS for the hostname and print it out
                try {
                    InetAddress address = InetAddress.getByName(ip);
                    System.out.println(address.getHostName() + theRest);
                } catch (UnknownHostException ex) {
                    System.err.println("Failed to resolve IP: " + ip + ", log entry: " + entry);
                }
            }
        } catch (IOException ex) {
            System.err.println("Exception reading log file: " + ex.getMessage());
        }
    }
}
