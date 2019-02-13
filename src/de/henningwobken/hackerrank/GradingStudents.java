package de.henningwobken.hackerrank;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GradingStudents {
    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        return Arrays.stream(grades).map(grade -> {
            if (grade >= 38 && grade % 5 >= 3) {
                return grade + (5 - grade % 5);
            } else {
                return grade;
            }
        }).toArray();
    }


    public static void main(String[] args) throws IOException {
        final Scanner scan = new Scanner(new File("/home/henning/dev/hackerrank/files/grading-students/test"));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.print(result[resultItr]);

            if (resultItr != result.length - 1) {
                System.out.print("\n");
            }
        }

    }
}
