package java2.classes.methods;

public class PassByValueOrReference {
    static void modifyMe(int num){
        num = 4;
        System.out.println("the value get modified: " +num);
    }

    public static void main(String[] args){
        int num = 2;
        // before modifying num: 2
        System.out.println("before modifying num: " +num);
        modifyMe(num);
        // after modifying num remains: 2
        System.out.println("after modifying num remains: " +num);
    }
}
