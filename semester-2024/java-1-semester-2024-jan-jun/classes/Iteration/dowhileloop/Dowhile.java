package java1.classes.Iteration.dowhileloop;

public class Dowhile {
    public static void main(String[] args) {
        System.out.println("Do while loop");
        String[][] studentGrade = {
                                    {"ahmed dicko", "4.0"},
                                    {"binta jallow", "3.35"},
                                    {"yuspha jarju", "2.75"},
                                    {"jainaba njie", "3.75"},
                                    };

        for (String[] s : studentGrade) {
            System.out.println(s);
        }

//        int count = 0;
//
//        do{
//            System.out.println(count);
//            count = count + 1;
//        } while(count < 0);
    }
}
