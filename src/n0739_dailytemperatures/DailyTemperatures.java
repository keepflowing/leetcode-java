package n0739_dailytemperatures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Using stack with tuples
public final class DailyTemperatures {
    public static int[] daysToHigherTemp(int[] temperatures) {
        Stack<Integer[]> stk = new Stack<>();
        int[] res = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            while(!stk.empty() && temperatures[i] > stk.peek()[0]) {
                Integer[] top = stk.pop();
                res[top[1]] = i - top[1];
            }
            Integer[] tuple = {temperatures[i], i};
            stk.push(tuple);
        }
        return res;
    }

    // Using deque
    public static int[] daysToHigherTemp2(int[] temperatures) {
        Deque<Integer> stk = new ArrayDeque<>();
        int[] res = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int prevIndex = stk.pop();
                res[prevIndex] = i - prevIndex;
            }
            stk.push(i);
        }
        return res;
    }
}
