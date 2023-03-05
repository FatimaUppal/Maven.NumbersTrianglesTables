package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String smallTable= "";

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                if (i * j <10){
                    smallTable+= " ";
                }
                smallTable += " "+ i * j + " |";
            }
            smallTable += "\n";
        }
        return smallTable;
    }

    public static String getLargeMultiplicationTable() {
        String largeTable= "";
        for( int i = 1; i<= 10; i++){
            for (int j=1; j<=10;j++){
                if (i * j < 100){
                    largeTable +=" ";
                    if (i * j < 10){
                        largeTable +=" ";
                    }
                }
                largeTable += i * j + " |";
            }
            largeTable += "\n";
        }
        return largeTable;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table= "";

        for( int i = 1; i<= tableSize; i++){
            for (int j=1; j<= tableSize;j++){
                if(i * j < 100){
                    table +=" ";
                    if (i * j <10){
                        table+= " ";
                    }
                }
                table += i * j + " |";
            }
            table += "\n";
        }
        return table;
    }
}
