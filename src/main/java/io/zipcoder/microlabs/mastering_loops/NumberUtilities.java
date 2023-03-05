package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNums = "";
        for (int i = start; i < stop ; i++){
            if (i % 2 == 0){
                evenNums += i;
            }

        }
        return evenNums;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNums = "";
        for (int i = start; i < stop ; i++){
            if (i % 2 != 0){
                oddNums += i;
            }

        }
        return oddNums;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String square= "";
        for (int i = start; i < stop; i += step){
            square += i * i;
        }
        return square;
    }

    public static String getRange(int start) {
        String range = "";
        for (int i = 0; i< start;i++){
            range += i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range2="";
        for (int i=start; i < stop ; i++){
            range2 +=i;
        }
        return range2;
    }


    public static String getRange(int start, int stop, int step) {
        String range3="";
        for (int i=start; i < stop ; i += step){
            range3 +=i;
        }
        return range3;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponential= "";
        for (int i = start; i< stop; i+= step){
            exponential += (int) Math.pow(i,exponent);
        }
        return exponential;
    }
}
