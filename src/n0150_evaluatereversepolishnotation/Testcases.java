package n0150_evaluatereversepolishnotation;

import java.util.Arrays;

public class Testcases {
    public static void main(String[] args) {
        System.out.println(13/5);
        String[][] cases = {
                {"2","1","+","3","*"},
                {"4","13","5","/","+"},
                {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}
        };

        for(String[] c : cases) {
            System.out.println(Arrays.toString(c));
            System.out.println(RPN.eval(c));
        }
    }
}
