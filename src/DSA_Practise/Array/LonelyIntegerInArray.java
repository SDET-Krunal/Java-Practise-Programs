package DSA_Practise.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyIntegerInArray {
    public static int lonelyInteger(List<Integer> a) {
        int n = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i: a) {
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Integer j: map.keySet()) {
            if (map.get(j) == 1){
                n = j;
                break;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 3, 2, 1};

        int n = lonelyInteger(Arrays.asList(arr));
        System.out.println("Lonely Integer: " + n);
    }
}
