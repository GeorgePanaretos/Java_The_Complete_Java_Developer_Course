public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // int myFirstNumber =5;
        int firstNumber = new Integer(5);
        // System.out.println(myFirstNumber);
        String firstString = "xs";
        String secondString = new String("xs");
        StringBuilder thirdString = new StringBuilder("xs");

        if (firstString == secondString)
            System.out.println("true");
        else
            System.out.println("false");
//        if (thirdString == firstString)
//            System.out.println("true");
//        else
//            System.out.println("false");


        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000 - myTotal;

        System.out.println(myLastOne);

    }
}
