package java1.assignment.assignment2;

import java.util.Random;

public class SolutionQ2 {
    public static void main(String[] args) {
        Random ran = new Random();
        int f1 =  ran.nextInt((9999 - 100) + 10);
        String empID = "2024-"+f1;
        String empName = "Lamin Bah";
        String empDept = "hr";
        double empSalary = 16000;

        System.out.println("Employee Detail:");
        System.out.println("Emp ID: " +empID);
        System.out.println("Emp Name: " +empName);
        System.out.println("Emp Department: " +empDept.toUpperCase());
        System.out.println("Emp Salary: " +empSalary);
    }
}
