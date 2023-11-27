package DSA_Practise.Array;

import java.util.Arrays;
import java.util.List;

public class RatioOfPositiveNegativeZeroInList {
    public static void plusMinus(List<Integer> arr) {
        double arrLength = arr.size();
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("proportion of positive values: " + String.format("%.6f", (positive / arrLength)));
        System.out.println("proportion of negative values: " + String.format("%.6f", (negative / arrLength)));
        System.out.println("proportion of zeros: " + String.format("%.6f", (zero / arrLength)));
    }

    public static void main(String[] args) {
        Integer[] arr = {-4, 3, -9, 0, 4, 1};

        plusMinus(Arrays.asList(arr));
    }
}
