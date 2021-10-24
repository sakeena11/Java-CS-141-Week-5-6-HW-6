import java.util.*;

public class Geometric {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the seed value for the random number generator:");
        int seed = scnr.nextInt();

        Random r = new Random(seed);

        System.out.println("Enter the number of trials:");
        int numTrials = scnr.nextInt();

        System.out.println("What number are we trying to roll? (2-12)");
        int target = scnr.nextInt();

        double totalRolls=0;
        for (int t = 1; t <= numTrials; t++) {

            int diceTotal = 0;
            int rollcount = 0;

            while (diceTotal != target) {
                int die1 = r.nextInt(6) + 1; //generate a die roll between 1-6
                int die2 = r.nextInt(6) + 1; //generate a die roll between 1-6
                diceTotal = die1 + die2;

                rollcount++;

            } //end while loop

            System.out.println("Trial #" + t + ": " + rollcount + " rolls to get " + target);

            totalRolls = totalRolls + rollcount;
        }
        double averageRolls = totalRolls / numTrials;
        System.out.printf("Average number of rolls to get " + target + " over " + numTrials + " trials is: %.1f", averageRolls);
        System.out.println();
    }
}
