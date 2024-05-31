import javax.imageio.ImageIO;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ImageHandler {

    private String outputPathGray = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen_Gray.jpg";

    public String DEFAULT_ASCII_CHARS = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\"^`'. ";

    public String SECOND_ASCII_CHARS = "█▓▒░ ";

    public String CHAR_SCALE = SECOND_ASCII_CHARS;

    public BufferedImage colorToGray(String path) throws IOException {
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

    /*
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
        return grayScale;
    }*/

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
                    int charIndex = (gray * (asciiLeng - 1)) / 255; // Gets the grayscale directly from the gray picture
                    asciiArt.append(asciiChars.charAt(charIndex));
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
