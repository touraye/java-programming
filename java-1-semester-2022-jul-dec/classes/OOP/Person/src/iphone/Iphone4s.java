package iphone;

public class Iphone4s extends Iphone4 {

    //google map method
    @Override
    public void googleMap(){
        System.out.println("Iphone uses iphone map");
    }
    //camera method
    @Override
    public void camera(){
        System.out.println("Iphone have camera");
    }

    //PotraitCamera method
    public void potraitCamera(){
        System.out.println("Iphone have a a potrait camera");
    }

    @Override
    public String batteryLife(int percentage) {
        if(percentage > 75){
            return "Battery Health " +percentage+ "%, good battery";
        } else if(percentage > 55 && percentage <= 74){
            return "Battery Health " +percentage+ "%, weak battery";
        } else {
            return "Battery Health " +percentage+ "%, dead battery";
        }
    }
}

