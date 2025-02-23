package java2.classes.oop.isAandHasA;

import java.util.ArrayList;

class Course {
    private String name;
    private String description;
    private boolean isMounting;
    static int count = 0;
    private int maxNumber;
    private ArrayList<Student> studentList;

    public Course(String name, String description, boolean isMounting, int maxNumber) {
        this.name = name;
        this.description = description;
        this.isMounting = isMounting;
        this.maxNumber = maxNumber;
        count += 1;
    }

    void addStudentToCourse(Student student){
        studentList.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMounting() {
        return isMounting;
    }

    public void setMounting(boolean mounting) {
        isMounting = mounting;
    }

    public static int getCount() {
        return count;
    }
}

class courseMgnt {
    private ArrayList<Course> courseList;

    void registerCourse(Course course){
        courseList.add(course);
        System.out.println(course.getName()+ " is registered");
    }
    void registerStudent(Student student, Course course){
        // add a student to the course
        course.addStudentToCourse(student);
    }
}

class Student {
    private String full_name;
    private float points;
    private String dob;// format 'dd-mm-yyy'
    private String program;
    private String major;

    void computeGPA(){
        // go through the course list of each student and compute their GPA
    }
}
public class SchoolMngt {
    public static void main(String[] args) {
        courseMgnt mgnt = new courseMgnt();
        Course course1 = new Course("Foundational", "foundational course", true, 5);
        Course course2 = new Course("Java One", "Programming One", false, 5);
        Course course3 = new Course("Web One", "Web Programming One", false, 5);
        System.out.println(Course.count);

        mgnt.registerCourse(course1);
        mgnt.registerCourse(course2);
        mgnt.registerCourse(course3);

    }
}
