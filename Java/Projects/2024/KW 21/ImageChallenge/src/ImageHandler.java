import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandler {
    private String inputPath = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen.jpg";
    private String outputPath = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen_new.png";

    public void readAndWriteImage() throws IOException {
        File file = new File(inputPath);
        BufferedImage image = ImageIO.read(file);
        ImageIO.write(image, "png",new File(outputPath));
    }
}
