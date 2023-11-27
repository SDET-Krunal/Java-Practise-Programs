package DSA_Practise.Array;

import java.util.Arrays;
import java.util.List;

public class MinMaxSumFromList {

    public static void miniMaxSum(List<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        int sum = 0;

        // Find min and max value from given array
        for (Integer i : arr) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }

        // Sum of all elements of given array
        for (Integer i : arr) {
            sum = sum + i;
        }

        System.out.println("Minimum sum: " + (sum - max));
        System.out.println("Maximum sum: " + (sum - min));
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        miniMaxSum(Arrays.asList(arr));
    }
}
