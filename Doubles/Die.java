package Doubles;

import java.util.Random;

public class Die {
    private int value;

    public Die() {
        Roll();
    }

    public void Roll() {
        Random random = new Random();
        setValue(random.nextInt(6) + 1);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
