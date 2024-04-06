package n49_groupAnagrams;

import java.util.Arrays;
import java.util.List;

public class Testcases {
    public static void main(String[] args) {
        String[][] cases = {
                {"eat", "tea", "tan", "ate", "nat", "bat"},
                {""},
                {"a"}
        };

        for (String[] c : cases) {
            System.out.println("Input: " + Arrays.toString(c));
            List<List<String>> res = Anagram.group(c);
            System.out.println("Output: " + res);
        }
    }
}
