import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HTMLExample {

    public static void main(String[] args) {
        HTMLExample ex = new HTMLExample();

    }
    public HTMLExample() {

        try {
            URL url = new URL("https://en.wikipedia.org/wiki/Jaguar");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            String line;
            while( (line = reader.readLine() ) != null) {

                if (line.contains("/wiki/")  && line.contains("<a href=")) {
                    System.out.println(line.indexOf("/wiki/"));

                    int n = line.indexOf("/wiki/");
                    String miniline = line.substring(n);
//                    System.out.println(miniline);

                    int m = miniline.indexOf("\"");
                    String smallline = miniline.substring(0, m);
                    System.out.println(smallline);
                }
            }
            reader.close();
        }

        catch (IOException e) {
            System.out.println(e);
        }

    }
}
