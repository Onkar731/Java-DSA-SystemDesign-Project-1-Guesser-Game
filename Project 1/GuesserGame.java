public class GuesserGame {
    public static void main(String[] args) {

        // starting game
        System.out.println("Game Stared....");

        // creating object of mediator
        Mediator m = new Mediator();

        // guesser guessing number
        m.guesserNumber();

        // player guessing number
        m.playerNumber();

        // evaluating for winner
        m.findMatch();

        // end of game
        System.out.println("Game Ended....");
    }
}