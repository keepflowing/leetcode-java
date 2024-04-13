package n0739_dailytemperatures;

import java.util.Arrays;

public class Testcases {
    public static void main(String[] args) {
        int[][] cases = {
                {73,74,75,71,69,72,76,73},
                {30,40,50,60},
                {30,60,90}
        };

        for(int[] c : cases) {
            System.out.println(Arrays.toString(c));
            System.out.println(Arrays.toString(DailyTemperatures.daysToHigherTemp(c)));
        }
    }
}
