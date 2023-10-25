package marksheet;
import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        System.out.print("Enter the number of units: ");
        int numUnits = scanner.nextInt();
        
        // Create arrays to store student details and marks
        int[] sNo = new int[numStudents];
        String[] studentNames = new String[numStudents];
        int[][] marks = new int[numStudents][numUnits];
        
        // Input student details and marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            
            System.out.print("SNo: ");
            sNo[i] = scanner.nextInt();
            
            System.out.print("Student Name: ");
            studentNames[i] = scanner.next();
            
            for (int j = 0; j < numUnits; j++) {
                System.out.print("Enter marks for Unit " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
            
            System.out.println();
        }
        
        System.out.println("Welcome to Student Mark List Application");
        
        // Compute total and average marks for each student
        int[] totalMarks = new int[numStudents];
        double[] averageMarks = new double[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numUnits; j++) {
                sum += marks[i][j];
            }
            totalMarks[i] = sum;
            averageMarks[i] = (double) sum / numUnits;
        }
        
        // Compute average marks for each unit
        double[] unitAverages = new double[numUnits];
        
        for (int j = 0; j < numUnits; j++) {
            int sum = 0;
            for (int i = 0; i < numStudents; i++) {
                sum += marks[i][j];
            }
            unitAverages[j] = (double) sum / numStudents;
        }
        
        // Display the marksheet
        System.out.println("__________________________________________________________________________________________");
        System.out.println("SNo\tStudent Name\t\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
        System.out.println("__________________________________________________________________________________________");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print(sNo[i] + "\t");
            System.out.printf(studentNames[i] + "\t\t\t");
            
            for (int j = 0; j < numUnits; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            
            System.out.print(totalMarks[i] + "\t");
            System.out.printf("%.2f", averageMarks[i]);
            
            System.out.println();
        }
        
        System.out.println("__________________________________________________________________________________________");
        
        // Display average marks for each unit
        System.out.print("Unit Averages:\t\t\t");
        for (int j = 0; j < numUnits; j++) {
            System.out.printf("%.2f\t", unitAverages[j]);
            
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        // Close the scanner
        scanner.close();
    }
}
