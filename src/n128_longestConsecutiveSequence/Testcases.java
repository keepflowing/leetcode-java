package n128_longestConsecutiveSequence;

import java.util.Arrays;

public class Testcases {
    public static void main(String[] args) {
        int[][] cases = {
                {100,4,200,1,3,2},
                {0,3,7,2,5,8,4,6,0,1}
        };
        for(int[] c: cases) {
            System.out.println(Arrays.toString(c));
            System.out.println(Sequence.longestConsecutive(c));
        }
    }
}
