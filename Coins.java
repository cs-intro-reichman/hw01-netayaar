public class Coins {
    public static void main(String[] args) {
        int totalnumberOfCents = Integer.parseInt(args[0]);
        int numberOfQuarters = totalnumberOfCents/25;
        int remainderOfCents = totalnumberOfCents%25;
        System.out.println(" Use " + numberOfQuarters +" Quarters and " + remainderOfCents + " Cents ");
    }
}
