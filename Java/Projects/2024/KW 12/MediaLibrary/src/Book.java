public class Book extends Media {
    private String author;
    private int pageCount;


    @Override
    public void printInfo() {
        super.printInfo();
        String bookInfo = "Author: " + author +
                "\nPages: " + pageCount;

        System.out.println(bookInfo);
        System.out.println();
        System.out.println("***********************************************");
        System.out.println();

    }

    public Book(String name, String language, String genre, Double price, String author, int pageCount) {
        super(name, language, genre, price);

        this.author = author;
        this.pageCount = pageCount;
    }

}
