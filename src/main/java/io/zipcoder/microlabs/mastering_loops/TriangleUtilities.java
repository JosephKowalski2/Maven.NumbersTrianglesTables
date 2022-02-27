package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        numberOfRows--;
        for (int i = 0; i < numberOfRows; i++){
            for (int s = 0; s <= i; s++){
                triangle.append("*");
            }
            triangle.append("\n");
        }
        return String.valueOf(triangle);
    }

    public static String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++){
                row.append("*");
        }
        return String.valueOf(row);
    }

    public static String getSmallTriangle() {
        StringBuilder smallTriangle = new StringBuilder();
        for (int i = 0; i < 4; i++){
            for (int s = 0; s <= i; s++){
                smallTriangle.append("*");
            }
            smallTriangle.append("\n");
        }
        return String.valueOf(smallTriangle);
    }

    public static String getLargeTriangle() {
        StringBuilder largeTriangle = new StringBuilder();
        for (int i = 0; i < 9; i++){
            for (int s = 0; s <= i; s++){
                largeTriangle.append("*");
            }
            largeTriangle.append("\n");
        }
        return String.valueOf(largeTriangle);
    }
}
