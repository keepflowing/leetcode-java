package n0853_carfleet;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        FleetCase[] cases = {
                new FleetCase(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}),
                new FleetCase(10, new int[]{3}, new int[]{3}),
                new FleetCase(100, new int[]{0,2,4}, new int[]{4,2,1}),
                new FleetCase(10, new int[]{6,8}, new int[]{3,2}),
                new FleetCase(10, new int[]{0,4,2}, new int[]{2,1,3})
        };

        for(FleetCase c : cases) {
            System.out.println(c);
            int res = carFleet(c.target, c.position, c.speed);
            System.out.println(res);
        }
    }

    public static class FleetCase {
        public int target;
        public int[] position;
        public int[] speed;

        FleetCase(int t, int[] p, int[] s) {
            this.target = t;
            this.position = p;
            this.speed = s;
        }

        @Override
        public String toString() {
            return "target = " + this.target + " position = " +
                    Arrays.toString(this.position) + " speed = " +
                    Arrays.toString(this.speed);
        }
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        Stack<Double> stack = new Stack<>();

        for(int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        // Sort pairs based on first value in descending order
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        for(int[] p : pairs) {
            double currentTime = (double) (target - p[0]) / p[1];
            if (stack.isEmpty() || currentTime > stack.peek()) {
                stack.push(currentTime);
            }
        }

        return stack.size();
    }
}
