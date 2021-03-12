package FridayPocketChangeChallenge;

import java.util.Random;

public class Pocket {
    private int change;

    public int getChange() { return change; }

    public Pocket() {
        Random r = new Random();

        // determine if there is any change
        if (r.nextBoolean()) {
            // generate a random amount of change (up to $5)
            change = r.nextInt(500) + 1;
        }
    }
}
