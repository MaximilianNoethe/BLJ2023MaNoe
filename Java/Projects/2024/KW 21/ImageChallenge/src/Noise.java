import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Noise {


    public BufferedImage addNoise(BufferedImage image, double noisePercentage) {
        int width = image.getWidth();
        int height = image.getHeight();

        Random random = new Random();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (random.nextDouble() < noisePercentage) {
                    if (random.nextBoolean()) {
                        image.setRGB(x, y, Color.BLACK.getRGB());
                    } else {
                        image.setRGB(x, y, Color.WHITE.getRGB());
                    }
                }
            }
        }
        return image;
    }
}
