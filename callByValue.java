public class callByValue {
    public static void main(String[] args) {

        // swap -value exchange
        int a = 5;
        int b = 10;

        // swap
        int temp = a;
        a = b;
        b = temp; // temp=temperory

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}

// yahi swapping wali chiz , agar ek function kai andar karna chahe too : see in
// callByValueFunction.java