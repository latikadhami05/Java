import java.util.*;

public class syntaxWithParameter {
    public static void CalculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is:" + sum);
    }

    public static void main(String[] args) {
        CalculateSum();
    }
}
