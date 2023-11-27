package DSA_Practise.Array;

import java.util.Arrays;

public class Max_difference {
    public static int max_difference_with_collection(int[] arr) {
        Arrays.sort(arr);

        return arr[arr.length - 1] - arr[0];
    }

    public static int max_difference_without_collection(int[] arr) {
        int diff = 0;
        int max = 0;
        int i = 0;
        int j = arr.length - 1;

        while (i != j) {
            if (arr[i] > arr[j]) {
                diff = arr[i] - arr[j];
            } else {
                diff = arr[j] - arr[i];
            }

            if (diff > max) {
                max = diff;
            }

            i++;
            j--;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {23, 67, 1, 6, 97, 21, 7};

        int diff_with_collection = max_difference_with_collection(arr);
        int diff_without_collection = max_difference_without_collection(arr);
        System.out.println("Max difference with collection logic :: " + diff_with_collection);
    }
}
