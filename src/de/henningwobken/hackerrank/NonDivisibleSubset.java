package de.henningwobken.hackerrank;

public class NonDivisibleSubset {

    // Complete the nonDivisibleSubset function below.
//    static int nonDivisibleSubsetBruteForce(int k, int[] numbers) {
//        int maxLength = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            int length = 0;
//            for (int j = 0; j < numbers.length; j++) {
//                if (i != j && ) {
//                   length++;
//                }
//            }
//        }
//        return maxLength;
//    }

    static int nonDivisibleSubset(final int k, final int[] numbers) {
        // We only care about the rest of the division
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] % k;
        }
        // thats why there are at max k different numbers we have to handle
        final int[] occurences = new int[k];
        for (int i = 0; i < numbers.length; i++) {
            occurences[numbers[i]]++;
        }
        // Numbers divisible by k may only appear once (sum with itself would result in conflict)
        if (occurences[0] > 0) {
            occurences[0] = 1;
        }
        // Numbers where rest of division is k/2 may only appear once --> Possible only if k is even
        if(k % 2 == 0 && occurences[k/2] > 0) {
            occurences[k/2] = 1;
        }
        /*
            We do now have a matrix with occurences, e.g.:
            1, 1, 3, 4 with a divisor of 3 would become
            [0] = 1
            [1] = 2,
            [2] = 1
         */
        // Now try out combinations until you find the highest valid
        // Start with all elements and eliminate incompatible entries...
        while(true) {
            final int[] conflicts = calculateIncompatibilities(k, occurences);
            if (!hasConflicts(conflicts)) {
                break;
            }
            final int index = getIndexOfMaxmimum(conflicts);
            occurences[index] = 0;
        }

        return getSum(occurences);
    }

    static int getSum(final int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static int getIndexOfMaxmimum(final int[] numbers) {
        int maxConflicts = -1;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (maxConflicts < numbers[i]) {
                maxConflicts = numbers[i];
                index = i;
            }
        }
        return index;
    }

    static boolean hasConflicts(final int[] conflicts) {
        for (int i = 0; i < conflicts.length; i++) {
            if(conflicts[i] > 0) {
                return true;
            }
        }
        return false;
    }

    static int[] calculateIncompatibilities(final int k, final int[] occurences) {
        final int[] conflicts = new int[occurences.length];
        for (int i = 0; i < occurences.length; i++) {
            for (int j = i + 1; j < occurences.length; j++) {
                if (occurences[i] > 0 && occurences[j] > 0 && (i + j) % k == 0) {
                    conflicts[i] += occurences[j];
                    conflicts[j] += occurences[i];
                }
            }
        }
        return conflicts;
    }

    public static void main(final String[] args) {
        final int divisor = 7;
        final int[] numbers = {278,576,496,727,410,124,338,149,209,702,282,718,771,575,436};
        System.out.println(nonDivisibleSubset(divisor, numbers));
    }

}
