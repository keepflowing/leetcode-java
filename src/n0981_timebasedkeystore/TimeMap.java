package n0981_timebasedkeystore;

import java.util.ArrayList;
import java.util.HashMap;

class TimeMap {
    private final HashMap<String, ArrayList<TVPair>> hm;

    public TimeMap() {
        this.hm = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)) hm.put(key, new ArrayList<TVPair>());

        hm.get(key).add(new TVPair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)) return "";
        String res = "";
        ArrayList<TVPair> vals = hm.get(key);

        int l = 0;
        int r = vals.size() - 1;

        while(l <= r) {
            int m = (l + r) / 2;
            if(vals.get(m).time <= timestamp) {
                res = vals.get(m).val;
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return res;
    }

    private static class TVPair {
        int time;
        String val;

        TVPair(String val, int t) {
            this.time = t;
            this.val = val;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */