public class Book extends Media {
    private String author;
    private int pageCount;


    @Override
    public void printInfo() {
        super.printInfo();
        String bookInfo = "\nAuthor: " + author +
                "\nPages: " + pageCount;

        System.out.println(bookInfo);

    }

    public Book(String name, String language, String genre, Double price, String author, int pageCount) {
        super(name, language, genre, price);

        this.author = author;
        this.pageCount = pageCount;
    }


}
