package n347_topKFrequentElements;

import java.util.Arrays;

public class Testcases {
    public static void main(String[] args) {
        int[][] cases = {
                {1,1,1,2,2,3},
                {1}
        };
        int[] kValues = {2, 1};

        for(int i = 0; i < cases.length; i++) {
            System.out.println(Arrays.toString(cases[i]));
            int[] res = Element.topKFrequent(cases[i], kValues[i]);
            System.out.println(Arrays.toString(res));
        }
    }
}
