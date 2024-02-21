public class Game {
    Word word = new Word();

    public void startGame(){
        word.readFile("src\\wordlist.txt");
        word.randomWord();
    }


}
