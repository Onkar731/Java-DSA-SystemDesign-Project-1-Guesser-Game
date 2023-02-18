import java.util.Random;

public class Guesser {
    private int number;

    public int guessNumber() {
        // guessing number 0 to 99
        number = new Random().nextInt(99);
        
        return number;
    }

}