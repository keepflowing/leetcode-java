package n0022_generateparantheses;

import java.util.*;

public final class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = input.nextInt();
        System.out.println(generateParenthesis(n));
    }

    static Stack<Character> stack = new Stack<>();
    static List<String> res = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return res;
    }

    private static void backtrack(int open, int closed, int n) {
        if(open == closed && closed == n) {
            Iterator<Character> it = stack.iterator();
            StringBuilder temp = new StringBuilder();
            while(it.hasNext()) {
                temp.append(it.next());
            }
            res.add(String.valueOf(temp));
        }
        if(open < n) {
            stack.push('(');
            backtrack(open + 1, closed, n);
            stack.pop();
        }
        if(closed < open) {
            stack.push(')');
            backtrack(open, closed + 1, n);
            stack.pop();
        }
    }
}
