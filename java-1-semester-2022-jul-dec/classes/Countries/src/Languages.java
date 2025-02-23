import java.util.Scanner;

public class Languages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //global vars
        String language = null;
        String region;
        System.out.print("Enter your Country:");
        if(input.next().equalsIgnoreCase("gambia")){
            //check language
            System.out.println("Enter your Region");
            region = input.next();
            if(region.equals("wcr")){
                language = "Mandinka";
            }
            else if(region.equals("nbr")){
                language = "wollof";
            } else if(region.equals("urr")){
                language = "sarahule";
            } else {
                System.out.println("Incorrect Region!");
            }
        } else {
            System.out.println("No Gambia");
        }
        //Man man
        System.out.println("Language: " +language );

    }
}
