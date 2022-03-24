
public class Bins {
    //bins should have an array or list of some sort.
    // That is meant to track the # of times all possible dice roll sums have been reached.
    //For example, if there is a die object meant to represent two dice, the corresponding
    // bins class should be able to track every sum between 2 - 12.
    //If it were for 3, it would be between 3 -18. The lowest roll combo and the highest combo.
    //Arrays start at 0 so adjust the 10, so it'll be accurate.
    //0 will always be equal to the lowest possible roll. Subtract the number of dice to get your min.
 private static int min; //minimum roll value
 private static int max; //maximum roll value
 private static int[] bin;

public Bins () {
    this.min = 1;
    this.max = 6;
    this.bin = new int[max+1];

    }
    public Bins (int min, int max) {
    //look into accessed via instance reference.
    this.min = min;
    this.max = max;
    this.bin = new int[max+1];
}
    public void incrementBin (int num) {
        bin[num-min]++;
    }


    public int getBin(int num) {
        return bin[num-min];
}
}
//A bin is something that retains something.
//The bin will hold the value of each sum from each roll.
//We have a range from 2 to 12. We start from 2. End at 12.
//Create Bins that tracks the sum of each roll.

//Public Integer GetBins
//If we use 10, we get back the number of tens in the bin container
//that stores the number of tens in that bin container that stores the range.
//Identify the number to count in the bin.
//Want to have the bin find a number and counts how many times that
// number appears within our range. Then adds that to the sum.