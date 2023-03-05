package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                triangle += "*";
                }
                triangle += "\n";
            }
            return triangle;
    }


        public static String getRow ( int numberOfStars){
            String row = "";

            for (int i = 1; i <= numberOfStars; i++) {
                row += "*";
            }
            return row;
        }

        public static String getSmallTriangle () {
            String small = "";

            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < i; j++) {
                    small += "*";
                }
                small += "\n";
            }
            return small;
        }

        public static String getLargeTriangle () {
            String large = "";

            for (int i = 1; i < 10; i++) {
                for (int j = 0; j < i; j++) {
                    large += "*";
                }
                large += "\n";
            }
            return large;
        }
    }

