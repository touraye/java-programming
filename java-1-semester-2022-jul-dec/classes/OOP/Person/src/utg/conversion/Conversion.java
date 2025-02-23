package utg.conversion;

public class Conversion {
    double centimeter;

    public Conversion(double _centimeter){
        centimeter = _centimeter;
    }

    //convert centimeter to kilometer
    public void toKilometer(){
        double centimeterToKilometer =  centimeter / 100000.0;
        System.out.println(centimeter+ " cm is equivalent to " +centimeterToKilometer+ " km");
    }

    //convert centimeter to meter
    public void toMeter(){
        double centimeterToMeter =  centimeter / 100.0;
        System.out.println(centimeter+ " cm is equivalent to " +centimeterToMeter+ " m");
    }

    //convert centimeter to inch
    public void toInch(){
        double centimeterToInch =  0.3937 * centimeter;
        System.out.println(centimeter+ " cm is equivalent to " +centimeterToInch+ " inch");
    }

    //convert centimeter to feet
    public void toFeet(){
        double centimeterToFeet =  0.0328 * centimeter;
        System.out.println(centimeter+ " cm is equivalent to " +centimeterToFeet+ " feet");
    }
}
