package n0155_minstack;

import java.util.ArrayList;

class MinStack {
    ArrayList<Integer> stk = new ArrayList<>();
    ArrayList<Integer> minList = new ArrayList<>();
    int min = 0;

    public MinStack() {

    }

    public void push(int val) {
        if(stk.isEmpty()) min = val;
        else if(val < min) min = val;
        minList.add(min);
        stk.add(val);
    }

    public void pop() {
        stk.remove(stk.size() - 1);
        minList.remove(minList.size() - 1);
        if(!minList.isEmpty()) min = minList.get(minList.size() - 1);
    }

    public int top() {
        return stk.get(stk.size() - 1);
    }

    public int getMin() {
        return minList.get(minList.size() - 1);
    }
}