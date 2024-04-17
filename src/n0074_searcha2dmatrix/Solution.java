package n0074_searcha2dmatrix;

class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if(nums[m] < target) l = m+1;
            else if(nums[m] > target) r = m-1;
            else return true;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] r : matrix) {
            if(r[r.length-1] < target) continue;
            else return search(r, target);
        }
        return false;
    }
}