public class Media {
    private String name;
    private String language;
    private String genre;
    private Double price;

    public void printInfo() {
        String info = "Name: " + name +
                "\nLanguage: " + language +
                "\nGenre: " + genre +
                "\nPrice: " + price + "Fr.";

        System.out.println(info);
    }

    public Media(String name, String language, String genre, Double price) {
        this.name = name;
        this.language = language;
        this.genre = genre;
        this.price = price;
    }


}
