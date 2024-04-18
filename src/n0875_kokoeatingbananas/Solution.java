package n0875_kokoeatingbananas;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] c = {805306368,805306368,805306368};
        System.out.println(Arrays.toString(c));
        System.out.println(minEatingSpeed(c, 1000000000));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 1;

        for(int pile : piles) {
            r = Math.max(r, pile);
        }

        int res = r;

        while(l <= r) {
            int k = (l+r)/2;
            double timeToEat = 0;
            for(int pile : piles) {
                timeToEat += Math.ceil((double)pile/k);
            }

            if(timeToEat <= h) {
                res = Math.min(res, k);
                r = k - 1;
            }

            else l = k + 1;
        }

        return res;
    }
}