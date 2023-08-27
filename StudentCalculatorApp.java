package com.studentcalc;

import java.util.Scanner;

public class StudentCalculatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of subjects: ");
        int numOfSub = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numOfSub; i++) {
            System.out.print("Enter marks gained in subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks = totalMarks + marks;
        }

        double avrgPercentage = (double) totalMarks / numOfSub;

        char grade;

        if (avrgPercentage >= 90) {
            grade = 'A';
        } else if (avrgPercentage >= 80) {
            grade = 'B';
        } else if (avrgPercentage >= 70) {
            grade = 'C';
        } else if (avrgPercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks gained : " + totalMarks);
        System.out.println("Average Percentage : " + avrgPercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}