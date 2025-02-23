package utg.conversion;

import utg.conversion.Conversion;

public class Tester {
    public static void main(String[] args) {
        System.out.println("======= Unit Conversion App =========");
        Conversion conversion = new Conversion(1000);
        conversion.toKilometer();
        conversion.toMeter();
        conversion.toInch();
        conversion.toFeet();
    }
}
