public class Teller {
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer();
        customer.vending(store.getCustomer());
        for(int i = 0; i < store.customer.length; i++){
//            System.out.println(store.getCustomer()[i]+ "        " +store.getMeter()[i]);

        }

    }
}
