import javax.imageio.ImageIO;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImageHandler {
    private String outputPathGray = "C:\\Users\\sussy\\Downloads\\vina_GRAY.png";
    public String DEFAULT_ASCII_CHARS = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\"^`'. ";
    public String SECOND_ASCII_CHARS = "█▓▒░ ";
    public String CHAR_SCALE = SECOND_ASCII_CHARS;

    public BufferedImage colorToGray(String path) {
        try {
            File file = new File(path);
            BufferedImage image = ImageIO.read(file);
            BufferedImage grayImg = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY); // Turns the picture gray with the same dimension as the original

            ColorConvertOp grayScaleConversionOp = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null); // ColorConvertOp is used to convert color into gray

            grayScaleConversionOp.filter(image, grayImg); // Executes the conversion with image as input and grayImg as output
            ImageIO.write(grayImg, "png", new File(outputPathGray));

            return grayImg;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void convertToAscii(String path, String asciiChars, String outputPathTxt) {
        StringBuilder asciiArt = new StringBuilder();
        try {
            BufferedImage grayImg = colorToGray(path);

            int width = grayImg.getWidth();
            int height = grayImg.getHeight();

            int asciiLeng = asciiChars.length();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int gray = grayImg.getRGB(x, y) & 0xFF;
                    int charIndex = (gray * (asciiLeng - 1)) / 255; // Scaled to result an index
                    asciiArt.append(asciiChars.charAt(charIndex)); // Index from chars selected and append to asciiArt
                }
                asciiArt.append("\n");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPathTxt))) {
                writer.write(asciiArt.toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
