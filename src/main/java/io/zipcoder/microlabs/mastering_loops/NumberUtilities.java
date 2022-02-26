package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        String evenNumbers = "";

        for (int i = start; i < stop; i++){
            if (i % 2 == 0){
                evenNumbers += Integer.toString(i);
            }
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {

        String oddNumbers = "";

        for (int i = start; i < stop; i++){
            if (i % 2 != 0){
                oddNumbers += Integer.toString(i);
            }
        }
        return oddNumbers;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
