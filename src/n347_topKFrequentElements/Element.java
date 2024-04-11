package n347_topKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;

public final class Element {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        ArrayList<ArrayList<Integer>> frequencies = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            frequencies.add(new ArrayList<>());
        }

        for(int x: nums) {
            if(!count.containsKey(x)) count.put(x, 0);
            else {
                count.put(x, (count.get(x) + 1));
            }
        }

        for(Integer key : count.keySet()) {
            frequencies.get(count.get(key)).add(key);
        }

        int pushed = 0;
        int[] res = new int[k];

        for(int i = nums.length - 1; i >= 0; i--) {
            ArrayList<Integer> subArray = frequencies.get(i);
            if (!subArray.isEmpty()) {
                for(Integer x : subArray) {
                    res[pushed] = x;
                    pushed++;
                    if(pushed == k) return res;
                }
            }
        }
        return res;
    }
}
