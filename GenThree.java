public class GenThree {
    public static void main(String[] args) {
        int minimum = Integer.parseInt(args[0]);
        int maximum = Integer.parseInt(args[1]);
        int randomOne = (int)(Math.random() * (maximum-minimum)) + minimum;
        int randomTwo = (int)(Math.random() * (maximum-minimum)) + minimum;
        int randomThree = (int)(Math.random() * (maximum-minimum))+ minimum;
        int firstMin = Math.min(randomOne, randomTwo);
        int finalMin = Math.min(firstMin, randomThree);
        System.out.println(randomOne);
        System.out.println(randomTwo);
        System.out.println(randomThree);
        System.out.println("The minimum generated number was " + finalMin);
    }
}
