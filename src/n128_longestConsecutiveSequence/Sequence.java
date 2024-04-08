package n128_longestConsecutiveSequence;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public final class Sequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longest = 1;
        for(int x : set) {
            if(!set.contains(x-1)) {
                int streak = 1;
                for(int i = 1; i < nums.length; i++) {
                    if(!set.contains(x+i)) break;
                    streak++;
                    if (streak > longest) longest = streak;
                }
            }
        }
        return longest;
    }
}
