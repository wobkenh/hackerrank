package de.henningwobken.hackerrank;

public class EqualizeTheArray {

    // Complete the equalizeArray function below.
    static int equalizeArray(final int[] arr) {
        final int[] occurences = new int[100];
        for (int i = 0; i < arr.length; i++) {
            occurences[arr[i] - 1]++;
        }
        return arr.length - getMaxmimum(occurences);
    }

    static int getMaxmimum(final int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

}
