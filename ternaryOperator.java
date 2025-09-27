package Basics;

public class ternaryOperator {
    public static void main(String args[]) {
        int number = 5;

        // ternaryoperator
        // variable=condition?statement1:statement2;
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
