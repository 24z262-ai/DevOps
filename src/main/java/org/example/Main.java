package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter register number: ");
        int regNo = sc.nextInt();

        System.out.print("Enter marks in Java: ");
        int java = sc.nextInt();

        System.out.print("Enter marks in Python: ");
        int python = sc.nextInt();

        System.out.print("Enter marks in DBMS: ");
        int dbms = sc.nextInt();

        int total = java + python + dbms;
        double average = total / 3.0;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name       : " + name);
        System.out.println("Register No: " + regNo);
        System.out.println("Java       : " + java);
        System.out.println("Python     : " + python);
        System.out.println("DBMS       : " + dbms);
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);
        System.out.println("Grade      : " + grade);

        if (average >= 50)
            System.out.println("Result     : PASS");
        else
            System.out.println("Result     : FAIL");

        sc.close();
    }
}