import javax.imageio.ImageIO;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ImageHandler {

    private String outputPath = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen_Gray.jpg";

    private String DEFAULT_ASCII_CHARS = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\"^`'. ";

    public void colorToGray(String path) throws IOException {
        try {
            File file = new File(path);
            BufferedImage image = ImageIO.read(file);
            BufferedImage grayImg = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY); // Turns the picture gray with the same dimension as the original

            ColorConvertOp grayScaleConversionOp = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null); // ColorConvertOp is used to convert color into gray

            grayScaleConversionOp.filter(image, grayImg); // Executes the conversion with image as input and grayImg as output
            ImageIO.write(grayImg, "png", new File(outputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public ArrayList<Integer> getGrayScale(String path) throws IOException {
        ArrayList<Integer> grayScale = new ArrayList<>();
        try {
            File file = new File(path);
            BufferedImage image = ImageIO.read(file);

            int width = image.getWidth();
            int height = image.getHeight();

            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    int rgb = image.getRGB(x, y);
                    int r = (rgb >> 16) & 0xFF;
                    int g = (rgb >> 8) & 0xFF;
                    int b = (rgb & 0xFF);

                    int gray = (r + g + b) / 3;
                    grayScale.add(gray);

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(grayScale);

        return grayScale;
    }
}
