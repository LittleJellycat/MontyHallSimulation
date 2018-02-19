import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 1000000;
        int unchangedWins = 0;
        int changedWins = 0;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int carIndex = r.nextInt(3);
            int chosenIndex = r.nextInt(3);
            int openedDoor = 0;
            for (int j = 0; j < 3; j++) {
                if (j != chosenIndex && j != carIndex) {
                    openedDoor = j;
                    break;
                }
            }
            if (carIndex == chosenIndex) {
                unchangedWins++;
            }
            if (carIndex == 3 - chosenIndex - openedDoor) {
                changedWins++;
            }
        }
        System.out.println("For " + n + " rounds:");
        System.out.println("Door remains the same: " + (double) unchangedWins / n);
        System.out.println("Door changed: " + (double) changedWins / n);
    }
}
