import java.util.ArrayList;

public class GradeBook {
     ArrayList<String> subjectNames = new ArrayList<>();
     ArrayList<Integer> subjectMarks = new ArrayList<>();

    //Add subject name to subjectNames[]
    public void addSubjectName(String subjectName){
        subjectNames.add(subjectName);
    }

    //return list[] of subject names
    public ArrayList listOfSubjectName(){
        return subjectNames;
    }

    //Add student mark to subjectMark[]
    public void addSubjectMark(int subjectMark){
        subjectMarks.add(subjectMark);
    }

    //return list[] of student marks
    public ArrayList listOfStudentMark(){
        return subjectMarks;
    }
}
