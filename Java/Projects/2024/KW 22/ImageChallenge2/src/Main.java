public class Main {
    public static void main(String[] args) throws Exception {
        String inputPath = "C:\\Users\\sussy\\Downloads\\Aryan_Bisen.jpg";
        ImageHandler handler = new ImageHandler();

        handler.colorToGray(inputPath);
        handler.convertToAscii("C:\\Users\\sussy\\Downloads\\Aryan_Bisen_Gray.jpg", handler.DEFAULT_ASCII_CHARS, "C:\\Users\\sussy\\Downloads\\Aryan_Bisen_Gray.txt");
    }
}