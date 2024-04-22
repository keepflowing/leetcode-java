package n0424_longestrepeatingcharreplacement;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.characterReplacement("KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF", 4));
        System.out.println(sol.characterReplacement("AABABBA", 1));
        System.out.println(sol.characterReplacement(
                "EOEMQLLQTRQDDCOERARHGAAARRBKCCMFTDAQOLOKARBIJBISTGNKBQGKKTALSQNFSABASNOPBMMGDIOETPTDICRBOMBAAHINTFLH",
                7
        ));
        System.out.println(sol.characterReplacement("ABAA", 0));
    }

    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0;
        int max = 0;
        int biggest = 1;
        int total = 0;

        for(int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i))) {
                int count = hm.get(s.charAt(i)) + 1;
                if(count > biggest) biggest = count;
                hm.put(s.charAt(i),  count);
            }
            else hm.put(s.charAt(i), 1);
            total++;

            //System.out.println(hm);

            if(total - biggest <= k && total > max) max = total;
            else if(total - biggest > k) {
                int lCount = hm.get(s.charAt(l));
                if(lCount > 1) hm.put(s.charAt(l), lCount - 1);
                else hm.remove(s.charAt(l));
                l++;
                total--;
            }
        }
        return max;
    }
}
