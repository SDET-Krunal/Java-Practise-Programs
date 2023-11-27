package DSA_Practise.Array;

import java.util.Arrays;
import java.util.List;

public class TallestCandlesInBirthdayCake {
    public static int birthdayCakeCandles(List<Integer> arr) {
        int max = arr.get(0);
        int count = 0;

        // Find max value from given array
        for (Integer i : arr) {
            if (i > max) {
                max = i;
            }
        }

        // Count number of max element in given array
        for (Integer i : arr) {
            if (i == max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 2, 1, 3};
        int result = birthdayCakeCandles(Arrays.asList(arr));
        System.out.println("Number of tallest candles: " + result);
    }
}
