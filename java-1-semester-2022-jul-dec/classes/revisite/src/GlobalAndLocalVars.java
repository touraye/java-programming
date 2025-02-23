public class GlobalAndLocalVars {
    public static void main(String[] args) {
        //Global and Local Variables

        String accountNumber = "0069544039952";
        double balance = 9000;

        if(balance < 300){
            String message = "Your balance is low ";// You can only access message with in the if block
            System.out.println(accountNumber);
            System.out.println(message);
        } else  {

            // You can access message here because it is in a local state(Local Variable)
            System.out.println(accountNumber);
            String info = "Your balance is Okay!";
        }
        // You can access message here because it is in a local state(Local Variable)
        System.out.println(accountNumber);

    }
}
