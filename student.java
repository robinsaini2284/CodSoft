package codSoftTask;
import java.util.Scanner;

public class student{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects:");
        int nos = sc.nextInt();

        int totalM = 0;

        for (int i = 1; i <= nos; i++) {
            totalM += getValidMarks(i, sc);
        }

        System.out.println("Student Result:");

        int AvgP = totalM / nos;
        System.out.println("Total marks obtained in all subjects: " + totalM);
        System.out.println("Average percentage: " + AvgP);

        if (AvgP > 95) {
            System.out.println("Your grade: A+");
        } else if (AvgP > 90) {
            System.out.println("Your grade: A");
        } else if (AvgP > 85) {
            System.out.println("Your grade: B+");
        } else if (AvgP > 80) {
            System.out.println("Your grade: B");
        } else if (AvgP > 60) {
            System.out.println("Your grade: C");
        } else if (AvgP > 40) {
            System.out.println("Your grade: D");
        } else {
            System.out.println("Your grade: E");
        }
    }

    public static int getValidMarks(int subjectNumber, Scanner sc) {
        int mark;

        while (true) {
            System.out.println("Enter marks for subject " + subjectNumber + " (out of 100):");
            mark = sc.nextInt();

            if (mark >= 0 && mark <= 100) {
                break;
            } else {
                System.out.println("Invalid Data! Marks should be between 0 and 100. Please enter again.");
            }
        }

        return mark;
    }
}
