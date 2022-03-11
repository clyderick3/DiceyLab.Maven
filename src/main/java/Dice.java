import java.util.Random;

public class Dice {
private int numberOfDie;

    //N is the number of dies in our set. Ex: 2 dice. 3 dice.
    //set is N. However many sets we will use for our game.
    //Grouping of the same type of thing. Ex: Like 5 distinct plates. Cards.
    //random for a random roll.
    //verb. Action. Method. Random-Tossed.

    public Dice(int numberOfDie) {
        this.numberOfDie = numberOfDie;
    }

    //Make method.
    public Integer tossAndSum() {
        //Generate a random number N (Number of dies) times between 1-6.
        int min = 1;
        //max is exclusive. Set to 7 to include 6.
        int max = 7;
        int sum = 0;
        Random roll = new Random();
        for (int i = 0; i < numberOfDie; i++) {
           sum += roll.nextInt(min, max);

        }
        return sum;
    }
//create a test that says you can set a value to 2, etc.
}
