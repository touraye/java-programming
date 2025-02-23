package iphone;

public class Iphone3 extends Iphone{

    @Override
    public String batteryLife(int percentage) {
        if(percentage > 80){
            return "Battery Health " +percentage+ "%, good battery";
        } else if(percentage > 65 && percentage <= 79){
            return "Battery Health " +percentage+ "%, fair battery";
        } else if(percentage > 50 && percentage <= 64){
            return "Battery Health " +percentage+ "%, weak battery";
        } else {
            return "Battery Health " +percentage+ "%, weak battery";
        }
    }
}
