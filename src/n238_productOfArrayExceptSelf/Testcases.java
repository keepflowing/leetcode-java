package n238_productOfArrayExceptSelf;

import java.util.Arrays;

public class Testcases {
    public static void main(String[] args) {
        int[][] cases = {
                {1,2,3,4},
                {-1,1,0,-3,3}
        };
        for(int[] c : cases) {
            int[] sol = Solution.productExceptSelf(c);
            System.out.println(Arrays.toString(c));
            System.out.println(Arrays.toString(sol));
        }
    }
}
