public class Display {
    GradeBook gradeBook = new GradeBook();

    public void display(){
        System.out.println("Size " +gradeBook.listOfSubjectName().size());
        System.out.println("Size " +gradeBook.listOfStudentMark().size());
        System.out.println("Subject             Mark            Condition");
        for(int i = 0; i < gradeBook.listOfStudentMark().size(); i++){
            System.out.println(gradeBook.listOfSubjectName().get(i)+ "              "   +gradeBook.listOfStudentMark().get(i) +(Integer.parseInt((String) gradeBook.listOfStudentMark().get(i)) > 49 ? "pass" : "fail"));
        }
    }
}
