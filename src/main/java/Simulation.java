public class Simulation {
    public static void main(String[] args) {
        entryMessage();
        run(2,1000000);
    }

    private Dice dice;
    private Bins bins;
    private Integer numOfDice;
    private Integer numOfToss;


    //psvm = public static void method

    public Simulation (Integer numOfDice, Integer numOfToss){
        this.numOfDice = numOfDice;
        this.numOfToss = numOfToss;
        this.bins = new Bins(numOfDice, numOfDice * 6);
        this.dice = new Dice(numOfDice);
    }

    public static void run (Integer numOfDice, Integer numOfToss) {
        Dice dice = new Dice (numOfDice);
        Bins bins = new Bins (numOfDice, numOfDice * 6); //Fix out of bounds with parameter.

        for (int i = 0; i < numOfToss; i++){
            dice.tossAndSum();
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public static void printResults(){

    }

    public static void entryMessage(){
        System.out.println("***\nSimulation of 2 dice tossed for 1000000 times.\n" +
                "***");
    }


                //Create a simulation where two die are throw 1,000,000 times.
            }

