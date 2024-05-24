import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ImageHandler ih = new ImageHandler();


        try {
            ih.readAndWriteImage();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}