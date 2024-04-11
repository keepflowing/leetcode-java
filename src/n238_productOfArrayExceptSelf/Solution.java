package n238_productOfArrayExceptSelf;

public final class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];

        int p = 1;
        for(int i = 0; i < nums.length; i++) {
            sol[i] = p;
            p *= nums[i];
        }

        p = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            sol[i] *= p;
            p *= nums[i];
        }
        return sol;
    }
}