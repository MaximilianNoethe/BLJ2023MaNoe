public class Main {
    public static void main(String[] args) throws Exception {
        ImageHandler handler = new ImageHandler();
        String inputPath = "C:\\Users\\sussy\\Downloads\\vina.jpeg";
        String outputPath = "C:\\Users\\sussy\\Downloads\\vina_Gray.png";


        handler.colorToGray(inputPath);
        handler.convertToAscii(outputPath, handler.CHAR_SCALE, "C:\\Users\\sussy\\Downloads\\vina_Gray.txt");
    }
}