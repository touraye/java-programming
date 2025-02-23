package iphone;

public class Tester {
    public static void main(String[] args) {
        //iphone3 object
        Iphone3 iphone3 = new Iphone3();

        iphone3.setBrandName("iPhone3");
        iphone3.setBrandYear("2008");
        iphone3.setScreenSize("300px");

        System.out.println("========= iPhone3 Feature ===========");
        System.out.println("Brand Name: " +iphone3.getBrandName());
        System.out.println("Brand Year: " +iphone3.getBrandYear());
        System.out.println("Screen Size: " +iphone3.getScreenSize());
        System.out.print("Call Method: ");
        iphone3.call();
        System.out.print("Message Method: ");
        iphone3.message();
        System.out.print("Camera Method: ");
        iphone3.camera();
        System.out.print("Google Map Method: ");
        iphone3.googleMap();
        System.out.print("Ipod Method: ");
        iphone3.iPod();
        System.out.print("Browser Method: ");
        iphone3.browser();
        System.out.print("Email Method: ");
        iphone3.email();
        System.out.println("Battery Health: " +iphone3.batteryLife(40));



        Iphone4 iphone4 = new Iphone4();

        iphone4.setBrandName("iPhone4");
        iphone4.setBrandYear("2009");
        iphone4.setScreenSize("350px");

        System.out.println("--------------------------");
        System.out.println("========= iPhone4 Feature ===========");

        System.out.println("Brand Name: " +iphone4.getBrandName());
        System.out.println("Brand Year: " +iphone4.getBrandYear());
        System.out.println("Screen Size: " +iphone4.getScreenSize());
        System.out.print("Call Method: ");
        iphone4.call();
        System.out.print("Message Method: ");
        iphone4.message();
        System.out.print("Camera Method: ");
        iphone4.camera();
        System.out.print("Google Map Method: ");
        iphone4.googleMap();
        System.out.print("Ipod Method: ");
        iphone4.iPod();
        System.out.print("Browser Method: ");
        iphone4.browser();
        System.out.print("Email Method: ");
        iphone4.email();
        System.out.print("Flashlight Method: ");
        iphone4.flashLight();
        System.out.println("Battery Health: " +iphone4.batteryLife(66));

        System.out.println("--------------------------");
        System.out.println("========= iPhone4s Feature ========");
        Iphone4s iphone4s = new Iphone4s();
        iphone4s.setBrandName("iphone4s");
        iphone4s.setBrandYear("2011");
        iphone4s.setScreenSize("400px");

        System.out.println("Brand Name: " +iphone4s.getBrandName());
        System.out.println("Brand Year: " +iphone4s.getBrandYear());
        System.out.println("Screen Size: " +iphone4s.getScreenSize());
        System.out.print("Call Method: ");
        iphone4s.call();
        System.out.print("Message Method: ");
        iphone4s.message();
        System.out.print("Camera Method: ");
        iphone4s.camera();
        System.out.print("Google Map Method: ");
        iphone4s.googleMap();
        System.out.print("Ipod Method: ");
        iphone4s.iPod();
        System.out.print("Browser Method: ");
        iphone4s.browser();
        System.out.print("Email Method: ");
        iphone4s.email();
        System.out.print("Flashlight Method: ");
        iphone4s.flashLight();
        System.out.print("potraitCamera Method: ");
        iphone4s.potraitCamera();
        System.out.println("Battery Health: " +iphone4s.batteryLife(80));
    }

}
