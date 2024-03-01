import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RandomQuote {




    private void buildRequest() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://zenquotes.io/api/random"))
                    .GET()
                    .build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        
    }


    private void getResponse() {
        try {
            HttpRequest request = null;
            HttpResponse<String> response = HttpClient.newBuilder()
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void printResponse(){
        System.out.println();
    }

}
