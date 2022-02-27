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

        String squareNumbers = "";

        for (int i = start; i < stop; i += step){
                squareNumbers += Integer.toString(i * i);
        }
        return squareNumbers;

    }

    public static String getRange(int start) {
        String range = "";

        for (int i = 0; i < start; i++){
            range += Integer.toString(i);
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";

        for (int i = start; i < stop; i++){
            range += Integer.toString(i);
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";

        for (int i = start; i < stop; i+=step){
            range += Integer.toString(i);
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponentResult = "";
        int powerNum = 0;
        for (int i = start; i < stop; i+=step){
            powerNum = (int) Math.pow(i, exponent);
            exponentResult += Integer.toString(powerNum);
        }
        return exponentResult;
    }
}
