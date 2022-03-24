import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @org.junit.jupiter.api.Test

    void tossAndSum() {
        //Given N die.
        int numberOfDie = 2;
        Dice dice = new Dice(numberOfDie);

        //When we roll them
        int actual = dice.tossAndSum();

        //Then we add the sum.
        Assert.assertTrue(actual >= 2 && actual <= 12);
    }
}