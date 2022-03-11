public class Simulation {

    //psvm
    public static void main(String[] args) {

        Dice dice = new Dice(2);
        for (int i = 0; i < 10 ; i++) {
            //System.out.println(dice.tossAndSum());
            Integer result = dice.tossAndSum();
            if (result >= 10) {
                System.out.println(result);
            }
        }
    }

}
