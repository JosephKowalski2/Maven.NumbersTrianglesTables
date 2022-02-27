package io.zipcoder.microlabs.mastering_loops;

import org.w3c.dom.ls.LSOutput;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder smallMulti = new StringBuilder();

        for (int i = 1; i <= 5; i++){
            for (int l = 1; l <= 5; l++){
                if ((i * l) < 10) {
                    smallMulti.append(" ");
                }
                if (l == 1){
                    smallMulti.append(" ").append(i * l);
                    }
                else {
                    smallMulti.append(" | ").append(i * l);
                }
            }
            smallMulti.append("\n");
        }
        return smallMulti.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder largeMulti = new StringBuilder();

        for (int i = 1; i <= 10; i++){
            for (int l = 1; l <= 10; l++){
                if ((i * l) < 10) {
                    largeMulti.append(" ");
                }
                if (l == 1){
                    largeMulti.append(" ").append(i * l);
                }
                else {
                    largeMulti.append(" | ").append(i * l);
                }
            }
            largeMulti.append("\n");
        }
        return largeMulti.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder tableMulti = new StringBuilder();

        for (int i = 1; i <= tableSize; i++){
            for (int l = 1; l <= tableSize; l++){
                if ((i * l) < 10) {
                    tableMulti.append(" ");
                }
                if (l == 1){
                    tableMulti.append(" ").append(i * l);
                }
                else {
                    tableMulti.append(" | ").append(i * l);
                }
            }
            tableMulti.append("\n");
        }
        return tableMulti.toString();
    }
}
