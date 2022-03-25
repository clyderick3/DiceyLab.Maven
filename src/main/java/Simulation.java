public class Simulation {
    public static void main(String[] args) {
        run(2,1000000);
    }


    //psvm = public static void method
    public static void run (Integer numOfDice, Integer numOfToss) {
        Dice dice = new Dice (numOfDice);
        Bins bins = new Bins (); //

        for (int i = 0; i < numOfToss; i++){
            dice.tossAndSum();
            bins.incrementBin(dice.tossAndSum());
        }

    }
        //doesn't see a constructor that accepts two arguments.
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulations();
        sim.printResults();
        Dice dice = new Dice(2);
        for (int i = 0; i < 10; i++) {
            //System.out.println(dice.tossAndSum());
            Integer result = dice.tossAndSum();
            if (result >= 10) {
                System.out.println(result);

                //Create a simulation where two die are throw 1,000,000 times.
            }
        }
    }

