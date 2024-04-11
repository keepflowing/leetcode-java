package n0217_containsduplicate;

import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }
}