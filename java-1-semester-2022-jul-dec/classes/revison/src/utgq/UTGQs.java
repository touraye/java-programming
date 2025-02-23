package utgq;

public class UTGQs {
    //conversion
    double centimeter;

    //constructor

    public UTGQs(double centimeter){
        this.centimeter = centimeter;
    }

    public void toKilometer(){
        double centimeterToKilometer = centimeter / 10000;
        System.out.println(this.centimeter+ " is equivalent to " +centimeterToKilometer+ " km");
    }

    public void toInch(){
        double centimeterToInch = this.centimeter * 0.3937;
        System.out.println(this.centimeter+ " is equivalent to " +centimeterToInch+ " inch");
    }

    public void toFeet(){
        double centimeterToFeet = this.centimeter * 0.0328;
        System.out.println(this.centimeter+ " is equivalent to " +centimeterToFeet+ " feet");
    }

    public void toMeter(){
        double centimeterToMeter = this.centimeter / 1000;
        System.out.println(this.centimeter+ " is equivalent to " +centimeterToMeter+ "m");
    }
}
