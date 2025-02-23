package bmi;

public class BodyMass {
    public static void main(String[] args) {
        double weightInKilograms = 57;
        double heightInMeters = 1.7;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("BMI = " +bmi);

        if(bmi < 18 || bmi > 18 && bmi < 24.9){
            System.out.println("Underweight: less than 18.5 " +bmi);
        }
//        else if(bmi > 18 && bmi < 24.9){
//            System.out.println("Normal: between 18.5 and 24.9 " +bmi);
//        }
        else if(bmi > 25 || bmi < 29.9){
            System.out.println("Overweight: between 25 and 29.9 " +bmi);
        }
//        else {
//            System.out.println("Obese: 30 or greater " +bmi);
//        }
    }
}
