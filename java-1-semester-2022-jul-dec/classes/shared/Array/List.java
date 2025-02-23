package ecodes.com;

public class List {
    public static void main(String[] args) {
        String product[] = {"paint", "brush", "cement", "aluminium"};
        double price[] = {450.0, 175.0, 360.0, 750.0};
        double total = 0;
        System.out.println("==== Welcome To Ams Building Materials ====");
        System.out.println("Invoice ");
        System.out.println("Product   |  Price");
        for (int i = 0; i < product.length; i++){
            System.out.println(product[i]+ "     |  " +price[i]);
            total += price[i];
        }
        System.out.println("-------------------------------------");
        System.out.println("Total GMD" +total);
        System.out.println("Discount is GMD" +discount(total));
    }
    public static double discount(double amount){
        double discountRate = 2.5;
        double discount = amount / 100 * discountRate;
        return amount - discount;
    }
}
