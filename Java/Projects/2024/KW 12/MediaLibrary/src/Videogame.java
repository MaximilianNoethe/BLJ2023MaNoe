public class Videogame extends Media {
    private String publisher;
    private String platform;
    private int size;

    @Override
    public void printInfo() {
        super.printInfo();
        String videogameInfo = "\nPublisher: " + publisher +
                "\nPlatform: " + platform +
                "\nSize: " + size + "GB";

        System.out.println(videogameInfo);
    }

    public Videogame(String name, String language, String genre, Double price, String publisher, String platform, int size) {
        super(name, language, genre, price);

        this.publisher = publisher;
        this.platform = platform;
        this.size = size;
    }


}
