package bookexercises.dataAnalizer;

import java.util.Scanner;

public class DataAnalyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();

        boolean done = false;
        while(!done){
            System.out.print("Enter value or 'Q' to quite: ");
            String input = in.next();
            if(input.equalsIgnoreCase("Q")){
                done = true;//terminate
            } else {
                double x = Double.parseDouble(input);
                data.add(x);
            }
            System.out.println("Average = " + data.getAverage());
            System.out.println("Maximum = " + data.getMaximum());

        }
        System.exit(0);//quite program when finished!
    }
}
