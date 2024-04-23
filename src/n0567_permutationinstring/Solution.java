package n0567_permutationinstring;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.checkInclusion("adc", "dcda"));
        System.out.println(sol.checkInclusion("ab", "eidbaooo"));
        System.out.println(sol.checkInclusion("ab", "eidboaoo"));
        System.out.println(sol.checkInclusion("abc", "bbbca"));
        System.out.println(sol.checkInclusion("ccc", "cbac"));
    }

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[] freq = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            freq2[s2.charAt(i) - 'a']++;
            if (i >= n) {
                freq2[s2.charAt(i - n) - 'a']--;
            }
            if (Arrays.equals(freq, freq2))
                return true;
        }
        return false;
    }
}
