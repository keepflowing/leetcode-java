package n20_validParentheses;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Integer> symbols = new HashMap<>();
        Stack<Character> stk = new Stack<>();

        symbols.put('(', 0);
        symbols.put('[', 1);
        symbols.put('{', 2);
        symbols.put(')', 3);
        symbols.put(']', 4);
        symbols.put('}', 5);

        for(char c : s.toCharArray()) {
            if(symbols.get(c) > 2) {
                if(stk.isEmpty()) return false;
                if(symbols.get(stk.peek()) != symbols.get(c) - 3) return false;
                stk.pop();
            }
            else {
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
}
