import java.util.Scanner;

public class Player {
    private int playerNumber;

    public int guessNumber() {
        // accepting user's guessed number
        Scanner sc = new Scanner(System.in);
        System.out.print("Player... Kindly guess the number 0 to 99...  ");
        playerNumber = sc.nextInt();
        System.out.println();
        sc.nextLine();

        // closing resource
        sc.close();

        return playerNumber;
    }

}