package iphone;

public class Tester {
    public static void main(String[] args) {
        Iphone3 iphone3 = new Iphone3();
        iphone3.setBrandName("iPhone 3");
        iphone3.setTouchScreen("glace touch screen");
        iphone3.setBrandYear("2009");

        //display
        System.out.println("Brand Name: " +iphone3.getBrandName());
        System.out.println("Brand Year: " +iphone3.getBrandYear());
        System.out.println("Touch Screen: " +iphone3.getTouchScreen());
        iphone3.vibrate();
        iphone3.camera();
        iphone3.browser();
        iphone3.messaging();
        iphone3.music();
        iphone3.video();
        iphone3.youTube();
        iphone3.mapApp();
        iphone3.email();
        System.out.println("--------------------------------");

        Iphone4 iphone4 = new Iphone4();
        iphone4.setBrandName("iPhone 4");
        iphone4.setTouchScreen("glace touch screen");
        iphone4.setBrandYear("2010");

        //display
        System.out.println("Brand Name: " +iphone4.getBrandName());
        System.out.println("Brand Year: " +iphone4.getBrandYear());
        System.out.println("Touch Screen: " +iphone4.getTouchScreen());
        iphone4.vibrate();
        iphone4.camera();
        iphone4.browser();
        iphone4.messaging();
        iphone4.music();
        iphone4.video();
        iphone4.youTube();
        iphone4.mapApp();
        iphone4.email();
        iphone4.flashLight();


    }
}
