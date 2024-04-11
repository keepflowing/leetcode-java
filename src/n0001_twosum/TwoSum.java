package n0001_twosum;

import java.util.Hashtable;

public final class TwoSum {
    public static int[] findIndices(int[] nums, int target) {
        Hashtable<Integer, Integer> hm = new Hashtable<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(hm.containsKey(diff)) return new int[]{hm.get(diff), i};
            hm.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
