package evenandoddnumber;

public class EvenAndOdd {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++){
            System.out.println(x % 2 == 0  ? x+  " even number" : x+" odd number");
//            if(x % 2 == 0){
//                System.out.println(x+  " even number");
//            } else {
//                System.out.println(x+" odd number");
//            }
        }
    }
}
