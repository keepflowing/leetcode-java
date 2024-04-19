package n0153_findminimuminrotatedsa;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] cases = {
                {3,4,5,1,2},
                {4,5,6,7,0,1,2},
                {11,13,15,17},
                {8, 1, 2, 3, 4, 5, 6, 7}
        };

        for(int[] c : cases) {
            System.out.println(Arrays.toString(c));
            System.out.println(sol.findMin(c));
        }
    }
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = nums[0];

        while(l < r) {
            int m = (l+r)/2;

            if(nums[l] > nums[r]) {
                if(nums[m] > nums[r]) {
                    l = m+1;
                } else {
                    min = nums[m];
                    r = m;
                }
            }

            else {
                if(nums[m] < min) {
                    min = nums[m];
                    r = m;
                } else {
                    l = m+1;
                }
            }
        }

        return min;
    }
}
