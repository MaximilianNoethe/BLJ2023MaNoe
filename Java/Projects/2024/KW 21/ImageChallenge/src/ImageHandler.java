import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ImageHandler {
    Noise n = new Noise();
    private BufferedImage image;

    private double noisePercentage = 0.55;

    private String inputPath = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen.jpg";
    private String outputPathNoised = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen_Noisy.png";
    private String outputPathDenoised = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen_Denoised.png";


    public void noiseImage() {
        try {
            image = ImageIO.read(new File(inputPath));

            BufferedImage noisedImage = n.addNoise(image, noisePercentage);
            ImageIO.write(noisedImage, "png", new File(outputPathNoised));
            System.out.println("Oh No \uD83D\uDE14, some pixels got lost!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void denoise() {
        try {
            image = ImageIO.read(new File(inputPath));

            BufferedImage noisedImage = n.addNoise(image, noisePercentage);
            int width = image.getWidth();
            int height = image.getHeight();

            if (image == null) {
                throw new IOException("File could not be read");
            }


            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    if (isDeadPixel(x, y)) {
                        ArrayList<Color> neighbourColor = getNeighbourColor(x, y);
                        if (!neighbourColor.isEmpty()) {
                            Color average = getAverageColor(neighbourColor);

                            image.setRGB(x, y, average.getRGB());
                        }
                    }


                }
            }
            ImageIO.write(noisedImage, "png", new File(outputPathDenoised));
            System.out.println("Ouf, lets hope the damage isn't that big.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    private ArrayList<Color> getNeighbourColor(int x, int y) {
        ArrayList<Color> neighbourColor = new ArrayList<Color>();

        for (int i = -1; i < 1; i++) {
            for (int j = -1; j < 1; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int newPointX = x + i;
                int newPointY = y + j;

                if (pixelsInBound(newPointX, newPointY) && !isDeadPixel(newPointX, newPointY)) {
                    neighbourColor.add(new Color(image.getRGB(newPointX, newPointY)));
                }
            }
        }
        return neighbourColor;
    }

    private Color getAverageColor(ArrayList<Color> colors) {
        int r = 0;

        int g = 0;

        int b = 0;

        for (Color color : colors) {
            r = r + color.getRed();

            g = g + color.getGreen();

            b = b + color.getBlue();
        }

        int amount = colors.size();

        return new Color(r / amount, g / amount, b / amount);

    }

    private boolean isDeadPixel(int x, int y) {
        int rgb = image.getRGB(x, y);

        return rgb == Color.BLACK.getRGB() || rgb == Color.WHITE.getRGB();
    }

    private boolean pixelsInBound(int x, int y) {
        int width = image.getWidth();
        int height = image.getHeight();
        return 0 <= x && x < width && 0 <= y && y < height;
    }

    public int getRGB(int r, int g, int b) {
        return (r << 16) | (g << 8) | b;
    }


}
