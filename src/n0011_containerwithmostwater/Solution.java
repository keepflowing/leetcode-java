package n0011_containerwithmostwater;

class Solution {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{2,3,10,5,7,8,9}));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while(l < r) {
            int area = Math.min(height[l],height[r]) * (r - l);
            if (area > max) max = area;
            if(height[l] <= height[r]) l++;
            else r--;
        }
        return max;
    }
}
