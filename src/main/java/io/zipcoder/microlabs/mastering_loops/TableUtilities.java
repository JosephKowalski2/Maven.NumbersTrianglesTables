package io.zipcoder.microlabs.mastering_loops;

import org.w3c.dom.ls.LSOutput;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
            return TableUtilities.getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String tableMulti = "";

        for (int i = 1; i <= tableSize; i++){
            for (int t = 1; t <= tableSize; t++){
                tableMulti += String.format("%3d |", i * t);
            }
            tableMulti += "\n";
        }
        return tableMulti;
    }
}
