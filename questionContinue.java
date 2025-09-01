package Basics;
//question: Display of numbers enteres y user except multiplies of 10

//multiple of 10 mai the code will not run

import java.util.*;

public class questionContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your number:");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was:" + n);
        } while (true);
    }
}
