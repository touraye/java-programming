package ecodes.com;

public class GradesList {
    public static void main(String[] args) {
        System.out.println("==== welcome Ecodes Academy ====");
        String subjects[] = {"java", "web", "database", "networking"};
        double marks[] = {78, 89, 99, 88};
        double totalMark = 0;
        //Student is A student if average is over 90
        System.out.println("Subject  -  Mark");
        for(int i = 0; i < subjects.length; i++){
            System.out.println(subjects[i]+ "       " +marks[i]);
            totalMark += marks[i];
        }

        double averageMark = computeAverage(totalMark, subjects.length);
        System.out.println("The average mark is " +Math.ceil(averageMark));
    }

    //method to calculate the Average
    public static double computeAverage(double _totalMark, int length){
        double average = _totalMark / length;
        return average;
    }
}
