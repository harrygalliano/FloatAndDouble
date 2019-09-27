package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        /* Java coding challenge
        Convert a given number of pounds to kilograms.

        STEPS:
        1. Create a variable with the appropriate type to store the number of
        pounds to kilograms.
        2. Calculate the result i.e. the number of kilograms based on the
        contents of the variable above and store the results in a second
        appropriate variable.
        3. Print out the result.

        1 pound is equal to 0.45359237 of a kilogram.
         */

        double weightInPounds = 17.2343423d;
        double weightInKilograms = weightInPounds * 0.45359237d;
        System.out.println("weight in kilograms = " + weightInKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);



    }
}
