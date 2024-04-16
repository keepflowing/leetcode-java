package n0167_twoSum2;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int f = 0;
        int l = 0;
        int li = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[f] + numbers[li - l] == target) return new int[]{f+1,li-l+1};
            if(numbers[f] + numbers[li - l] > target) l++;
            else f++;
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] res = twoSum(new int[]{2,3,4}, 6);
        System.out.println(Arrays.toString(res));
    }
}
