public class Simulation {
    public static void main(String[] args) {
        entryMessage();
        Simulation simulation = new Simulation(2, 1000000);
        simulation.run(2,1000000);
        simulation.printResults();
    }

    private Dice dice;
    private Bins bins;
    private int min;
    private int max;
    private Integer numOfDice;
    private Integer numOfToss;


    //psvm = public static void method

    public Simulation (Integer numOfDice, Integer numOfToss){
        min = numOfDice;
        max = numOfDice * 6;
        this.numOfDice = numOfDice;
        this.numOfToss = numOfToss;
        this.bins = new Bins(min, max);
        this.dice = new Dice(numOfDice);

    }

    public static void run (Integer numOfDice, Integer numOfToss) {
        Dice dice = new Dice (numOfDice);
        Bins bins = new Bins (numOfDice, numOfDice * 6); //Fix out of bounds with parameter.

        for (int i = 0; i < numOfToss; i++){
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults(){
    String asterisk = "";
    int result = 0;
    double percent = 0;

    for (int i = 0; i<= (max-min); i++){
        result = bins.getBin(i+2);
        percent = ((double) result) / numOfToss;
            for (int j = 0; j < (Math.round(percent * 100)); j++){
                asterisk+= "*";
            }
        System.out.println(String.format("%4d   :   %10d:  %.2f %s", min + i, result, percent, asterisk));
            asterisk = "";
    }


    }

    public static void entryMessage(){
        System.out.println("***\nSimulation of 2 dice tossed for 1000000 times.\n" +
                "***");
    }


                //Create a simulation where two die are throw 1,000,000 times.
            }

