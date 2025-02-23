public class ShoppingCard {
    public static void main(String[] args) {
        double total = 0;
        double minPrice = 0;
        double maxPrice = 0;
        double average;
        String[] items = {"bread", "ataya", "sugar", "apple", "banana", "eggs"};
        double[] prices = {10, 10, 15, 20, 25, 8};

        //the length of the two arrays
        System.out.println("The length of item Array: " +items.length);
        System.out.println("The length of prices Array: " +prices.length);

        //iterate over the two Array and print out items with their prices
        System.out.println("Item Name       |      Item prices");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+  "                      " +prices[i]);
            total += prices[i];//total
            //check the minimum and maximum price
            if(prices[i] > maxPrice){
                maxPrice = prices[i];
            } else {
                minPrice = prices[i];
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("The total of your items price is: GMD" +total);
        average = total / items.length;
        System.out.println("The average your items price is GMD" +average);
        System.out.println("The maximum price is : GMD" +maxPrice);
        System.out.println("The minimum price is: GMD" +minPrice);
    }
}
