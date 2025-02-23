package java2.classes.recursion;

public class RecursionIntro {
    public static int f(int val) {
        if (val == 0 || val == 1){
            return val;
        }
        System.out.println(val);
        return f(val - 1);
    }
    /*
    Doughs in recursion:
    1. Why the condition to check for base case
    2. How the flow of program is working
    3. Why using recursion
    4. Why the error of StackOverFlow
    for (int i = 0; i < data.length; i++)
     */
    static void print(int n){
        // BASE CASE
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
    public static void main(String[] args) {
        System.out.println("PRINTING FIBONACCI NUMBERS FROM 0 UP TO 21");
        for (int i = 0; i <= 50; i++) {
            int ans = fibo(i);
            System.out.println(i+":" +ans);
        }

//        int ans = fibo(5);
//        System.out.println(ans);
//        int ans = f(5);
//        System.out.println(ans);

    }

    // fibonacci sequence
    static int fibo(int n) {
        // base case is when n is either 0 or 1
        if (n == 0 || n == 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
