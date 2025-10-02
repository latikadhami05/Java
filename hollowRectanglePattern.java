package Patterns;

public class hollowRectanglePattern {
    public static void hollow_rectangle(int totRows, int totCols) {

        // outer loop
        for (int i = 1; i <= totRows; i++) { // totRows=4 in this
            for (int j = 1; j <= totCols; j++) { // totCols=5 in this

                // boundary cells
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
