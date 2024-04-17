package n0042_trappingrainwater;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] cases = {
                {0,1,0,2,1,0,1,3,2,1,2,1},
                {4,2,3},
                {0,7,1,4,6},
                {9,6,8,8,5,6,3}
        };

        for(int[] c : cases) {
            System.out.println(Arrays.toString(c));
            System.out.println(trap(c));
        }
    }

    public static int trap(int[] height) {
        int l = 0;
        int m = 0;
        int r = height.length - 1;
        int total = 0;

        while(l < r) {
            if(height[l] <= height[r]) {
                m++;
            }
            else {
                int prevR = r;
                while(height[r] < height[l] && m < r) {
                    if(height[r] > height[prevR]) prevR = r;
                    r--;
                    if(height[r] < height[prevR]) total+= height[prevR] - height[r];
                }
            }
            if(height[m] < height[l]) {
                total += height[l] - height[m];
            }
            else if(height[l] <= height[m]) {
                l = m;
            }
        }
        return total;
    }
}
