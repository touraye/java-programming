public class HelloWorld {
    public static void main(String args[]){
        //Calculate 15% of 18,000
        final int percentage = 100;
        int rate = 15;
        double price = 18000;
        double ans = price / percentage * rate;
//        System.out.println(ans);

        //Your bank give 5% interest on your saving of GMD4000. how much will you make in 5?
        final int ratePerYear = 5;
        double saving = 4000;
        double interestPerYear = saving / 100 * ratePerYear;
        System.out.println("Your annual interest is GMD" +interestPerYear);
        int numberOFYears = 4;
        double interestInFourYear = numberOFYears * interestPerYear;
        System.out.println("interest of four year is GMD" +interestInFourYear);
        double totalSavingAfterFourYears = saving + interestInFourYear;
        System.out.println("Your final money is GMD" +totalSavingAfterFourYears);
    }
}
