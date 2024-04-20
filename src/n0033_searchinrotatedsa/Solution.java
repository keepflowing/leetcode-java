package n0033_searchinrotatedsa;

class Solution {
    public static void main(String [] args) {
        Solution sol = new Solution();
        System.out.println(sol.search(new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println(sol.search(new int[]{4,5,6,7,0,1,2}, 5));
        System.out.println(sol.search(new int[]{1,2,3,4,5,6}, 4));
        System.out.println(sol.search(new int[]{4,5,6,7,8,1,2,3}, 8));
        System.out.println(sol.search(new int[]{5,1,2,3,4}, 1));
    }

    public int search(int[] n, int t) {
        int l = 0;
        int r = n.length-1;

        while(l <= r) {
            int m = (l + r) / 2;

            if(n[m] == t) return m;

            if(n[l] <= n[m]) {
                if(t > n[m] || t < n[l]) l = m + 1;
                else r = m - 1;
            }

            else {
                if(t < n[m] || t > n[r]) r = m - 1;
                else l = m + 1;
            }
        }

        return -1;
    }
}
