public class Main {
    public static void main(String[] args) throws Exception {
        ImageHandler handler = new ImageHandler();
        String inputPath = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen.jpg";
        String outputPath = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen_Gray.jpg";


        handler.colorToGray(inputPath);
        handler.convertToAscii(outputPath, handler.CHAR_SCALE, "C:\\Users\\sussy\\Downloads\\Aryan_Bisen_Gray.txt");
    }
}