package ejaz;

import java.util.Scanner;

public class Practice{
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the number of subjects:");
	        int Subjects = scanner.nextInt();
	        
	        int totalMark = 0;
	        
	        System.out.println("Enter marks obtained in each subject:");
	        for (int a = 1; a <= Subjects; a++) {
	            System.out.println("Subject " + a + ":");
	            int marks = scanner.nextInt();
	            totalMark += marks;
	        }
	        
	        double avgPercentage = (double) totalMark / Subjects;
	        
	        char grade;
	        if (avgPercentage >= 90) {
	            grade = 'A';
	        } else if (avgPercentage >= 80) {
	            grade = 'B';
	        } else if (avgPercentage >= 70) {
	            grade = 'C';
	        } else if (avgPercentage >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        
	        System.out.println("Total Marks : " + totalMark);
	        System.out.println("Average Percentage : " + avgPercentage + "%");
	        System.out.println("Grade : " + grade);
	        
	        scanner.close();
	    }
	}
