package java2.classes.methods;

public class R {
    public static void run(int num){
        //System.out.println(num);
    }

    public static boolean canVote(int age){
        return age >= 18;
    }

    public static void main(String[] args) {
//        run(90);
//        run(20);

//        if(canVote(30)) {
//            System.out.println("You can vote");
//        } else {
//            System.out.println("You're under age");
//        }
        // ternary operator
        System.out.println(canVote(10) ? "You can vote"  : "You're under age");
    }
}
