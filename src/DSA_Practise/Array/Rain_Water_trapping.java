package DSA_Practise.Array;

public class Rain_Water_trapping {
    public static int trapped_rain_water(int[] arr) {
        int block_sum = 0;
        int al = arr.length;

        int[] left = new int[al];
        left[0] = arr[0];

        for (int i = 1; i < al; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        int[] right = new int[al];
        right[al - 1] = arr[al - 1];

        for (int i = al - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        for (int i = 0; i < left.length; i++) {
            block_sum += Math.min(left[i], right[i]) - arr[i];
        }

        return block_sum;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4, 0, 1, 3, 2};

        System.out.println("Number of blocks that can trap the water :: " + trapped_rain_water(a));
    }
}
