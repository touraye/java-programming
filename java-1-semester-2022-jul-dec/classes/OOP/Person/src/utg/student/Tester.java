package utg.student;

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student("Ahmed Dicko", 2013,"09347M3", "Sanchaba");
        Student student2 = new Student("Lamin Jammeh", 2018,"03445M3", "Jam City");
        Student student3 = new Student("Fatoumata Touray", 2014,"02747M3", "Talinding");

        System.out.println("========== UTG Student Information ============");
        System.out.println("Name             Year of joining             Mat NO             Address");
        System.out.println("--------------------------------------------------------------------------");
        student1.display();
        student2.display();
        student3.display();
    }
}
