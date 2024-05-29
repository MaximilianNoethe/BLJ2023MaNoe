import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandler {
    Noise n = new Noise();
    private double noisePercentage = 0.25;
    private String inputPath = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen.jpg";
    private String outputPath = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen_new.png";

    public void readAndWriteImage() throws IOException {
        File file = new File(inputPath);
        BufferedImage image = ImageIO.read(file);
        ImageIO.write(image, "png", new File(outputPath));
    }

    public void noiseImage() {
        try {
            BufferedImage image = ImageIO.read(new File(inputPath));
            BufferedImage noisedImage = n.addNoise(image, noisePercentage);

            ImageIO.write(noisedImage, "png", new File(outputPath));
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
