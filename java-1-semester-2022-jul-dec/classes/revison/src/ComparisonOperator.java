public class ComparisonOperator {
    public static void main(String[] args) {
        /*
        Comparison Operator
            >     Greater than
            <      Less than
            >=      Greater than or equals to
            <=      Less than or equals to
            ==      Equals to
            !=      Not equals to
         */

        double amount1 = 500.60;
        double amount2 = 500.00;
        double amount3 = 405.30;
        double amount4 = 20.50;
        boolean buy1 = amount1 > amount4 || amount2 <= amount3;
        boolean buy2 = amount1 <= amount4 && amount2 >= amount3;
        boolean buy3 = !(amount1 < amount4 && amount2 >= amount3);
    }
}
