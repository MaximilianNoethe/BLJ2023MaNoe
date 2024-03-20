public class Song extends Media {
    private String singer;
    private int duration;

    @Override
    public void printInfo() {
        super.printInfo();
        String songInfo = "\nSinger: " + singer +
                "\nDuration: " + duration;

        System.out.println(songInfo);
    }

    public Song(String name, String language, String genre, Double price, String singer, int duration) {
        super(name, language, genre, price);
        this.singer = singer;
        this.duration = duration;
    }


}
