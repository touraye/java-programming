package java2.assignment.SchoolMgt;

import java.util.ArrayList;
import java.util.Collections;

public class SchoolManagementSystem {

    // this method takes a Person list and id of type String. The will iterate over a person collection, for each person its id will compare againt the inputed id using the String contains method which returns a boolean value
    // upon finding a match id the if block will execute and the current person will be assigned to findPerson and the loop will break and findPerson will be return
    // otherwise the loop will continue to iterate over the input list and at the end the method will null hence findPerson is still null

    static Person findPerson(ArrayList<Person> list, String id){
        Person findPerson = null;
        for(Person person : list){
            if(person.id.contains(id)){
                 findPerson = person;
                 break;
            }
        }

        return findPerson;
    }
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>(); // create collections of type Person to store different persons
        ArrayList<Employee> employeeList = new ArrayList<>(); // collections for employees
        ArrayList<Student> studentList = new ArrayList<>(); // collections for students

        // create an employee and student object
        Employee employee = new Employee("Awa Manga", 25, "em-10233", 25600.00);
        Student student = new Student("Fatou touray", 21, "st-20203", "Banking and Finance");

        /*
        Student subclasses: UndergraduateStudent, graduateStudent
         */
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Kaddy Sowe", 21, "td5594", "Computer Science", 2023);
        GraduateStudent graduateStudent = new GraduateStudent("Lamin Bah", 25, "td-8907", "Political Science", "Why african leaders are corrupt");

        /*
        Employee subclasses:Administrative Staff, Teacher, Technical Staff
         */
        AdministrativeStaff administrativeStaff = new AdministrativeStaff("Bakary Manneh", 38, "am-0983", 40500.00, "HOD");
        Teacher teacher = new Teacher("Mr. Trawally", 40, "am-0987", 43000.00, "International Politics");
        TechnicalStaff technicalStaff = new TechnicalStaff("Bubacarr Barry", 27, "ad-90454", 38000.00, "Database Admin");

        // add Person objects to list
        list.add(undergraduateStudent);
        list.add(graduateStudent);
        list.add(administrativeStaff);
        list.add(teacher);
        list.add(technicalStaff);
        list.add(employee);

        // add employee to employeeList
        employeeList.add(employee);
        employeeList.add(administrativeStaff);
        employeeList.add(teacher);
        employeeList.add(technicalStaff);

        // add students to studentList
        studentList.add(student);
        studentList.add(undergraduateStudent);
        studentList.add(graduateStudent);

        // sort list
        Collections.sort(list);

        // iterate over Person's list
        for(Person person : list){
            person.display();
            person.greeting();
            // called attendLecture() if person is under graduate
            if(person.equals(undergraduateStudent)){
                undergraduateStudent.attendLecture();
            }
            
            // for GraduateStudent called conductResearch().
            if(person.equals(graduateStudent)){
                graduateStudent.conductResearch();
            }

            // for AdministrativeStaff called performDuties()
            if(person.equals(administrativeStaff)){
                administrativeStaff.performDuties();
            }

            // for TechnicalStaff called maintainEquipment().
            if(person.equals(technicalStaff)) {
                technicalStaff.maintainEquipment();
            }

            // if person is Student but UndergraduateStudent or GraduateStudent called study().
            if(student.equals(undergraduateStudent) && student.equals(graduateStudent)){
                student.study();
            }

            // if person is Employee but not admin staff, teacher nor technical staff
            if(person.equals(employee) && !person.equals(administrativeStaff) && !person.equals(teacher) && !person.equals(technicalStaff)){
                System.out.println("New role to assign to ["+person.name+"]");
            }
        }


        System.out.println();

        System.out.println("Find person:");
        // invoke the findPerson method, pass in an id of a person and chain display method
        // this method will return a person which will be displayed using display method or null if no person is found
        findPerson(list, "td5594").display();

    }
}
