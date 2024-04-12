package n0150_evaluatereversepolishnotation;

import java.util.Stack;
import java.util.HashMap;

public final class RPN {
    public static int eval(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        HashMap<String, Runnable> ops = new HashMap<>();

        ops.put("+", () -> stk.push(stk.pop() + stk.pop()));
        ops.put("-", () -> {
            int y = stk.pop();
            int x = stk.pop();
            stk.push(x - y);
        });
        ops.put("*", () -> stk.push(stk.pop() * stk.pop()));
        ops.put("/", () -> {
            int y = stk.pop();
            int x = stk.pop();
            stk.push(x/y);
        });

        for(String token : tokens) {
            if(ops.containsKey(token)) ops.get(token).run();
            else stk.push(Integer.valueOf(token));
        }
        return stk.pop();
    }
}
