public class Song extends Media {
    private String singer;
    private double duration;

    @Override
    public void printInfo() {
        super.printInfo();
        String songInfo = "Singer: " + singer +
                "\nDuration: " + duration + " min";


        System.out.println(songInfo);
        System.out.println();
        System.out.println("***********************************************");
        System.out.println();
    }

    public Song(String name, String language, String genre, Double price, String singer, double duration) {
        super(name, language, genre, price);
        this.singer = singer;
        this.duration = duration;
    }

}
