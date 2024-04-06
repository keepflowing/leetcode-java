package n49_groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Hashtable;

public final class Anagram {
    public static List<List<String>> group(String[] strs) {
        List<List<String>> g = new ArrayList<>();
        Hashtable<String, Integer> hm = new Hashtable<>();

        for (String s : strs) {
            char[] ar = s.toCharArray();
            Arrays.sort(ar);
            String sorted = String.valueOf(ar);
            if(hm.containsKey(sorted)) {
                g.get(hm.get(sorted)).add(s);
            }
            else {
                hm.put(sorted, hm.size());
                List<String> nl = new ArrayList<>();
                nl.add(s);
                g.add(nl);
            }
        }
        return g;
    }
}
