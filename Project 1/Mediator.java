public class Mediator {
    private int guesserNumber;
    private int playerNumber;

    public void guesserNumber() {
        guesserNumber = new Guesser().guessNumber();
    }

    public void playerNumber() {
        playerNumber = new Player().guessNumber();
    }

    public void findMatch() {
        if(guesserNumber == playerNumber) {
            System.out.println("Congrats..!! You won the game..!!!");
        } else {
            System.out.println("Ooopss..!! You loose the game..!!\nTry again...");
        }
    }
}