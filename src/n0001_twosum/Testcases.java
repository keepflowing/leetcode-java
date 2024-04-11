package n0001_twosum;

import java.util.Arrays;

public class Testcases {
    public static void main(String[] args) {
        int[][] numbers = {{2,7,11,15}, {3,2,4}, {3,3}};
        int[] targets = {9, 6, 6};
        for(int i = 0; i < numbers.length; i++) {
            int[] res = TwoSum.findIndices(numbers[i], targets[i]);
            System.out.println(Arrays.toString(res));
        }
    }
}
