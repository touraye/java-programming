package list;

public class Grades {
    public static void main(String[] args) {
        String course[] = {"java intro", "web program", "database", "networking", "operating S"};
        int totalMarks[] = {90,98,45,54, 77};
        int totalMark = 0;
        double averageMark = 0;
        int maxMark = 0;
        int minMark = 100;//set the min-mark to 100 which is the maximum grade at least. if set it 0 the min-mark will always be 0. you can check it

        System.out.println("=== Final Marks of the Student =======");
        System.out.println("Course     |  Marks");
        for(int i = 0; i < course.length; i++){
            System.out.println(course[i]+ " | " +totalMarks[i]);
            totalMark += totalMarks[i];
            System.out.println("Total totalMark = " +computeTotal(totalMarks[i]));
            computeAverage(totalMark);
            if(totalMarks[i] < minMark){
                minMark = totalMarks[i];
            }
            if(totalMarks[i] > maxMark){
                maxMark = totalMarks[i];
            }
        }
        System.out.println("Maximum mark " +maxMark);
        System.out.println("Minimum mark " +minMark);
    }

    public static int computeTotal(int totalMark){
        return totalMark;
    }

    public static double computeAverage(int totalMark){
        System.out.println("Before compute " +totalMark);
        double average = totalMark / 5;
        System.out.println("computed average " +average);
        return average;
    }

}
