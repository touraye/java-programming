package java1.classes.methods;

public class Calculator {
    public static int addition(int val1, int val2){
        int sum = val1 + val2;
        return sum;
    }

    public static void main(String[] args) {
        int sum = addition(2, 5);
        System.out.println(sum);
    }
}
