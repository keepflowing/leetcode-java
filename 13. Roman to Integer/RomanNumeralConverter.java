import java.util.Hashtable;

public final class RomanNumeralConverter {

        public static int toInt(String s) {
            Hashtable<Character, Integer> dict = new Hashtable<>();
            dict.put('I', 1);
            dict.put('V', 5);
            dict.put('X', 10);
            dict.put('L', 50);
            dict.put('C', 100);
            dict.put('D', 500);
            dict.put('M', 1000);

            int total = 0;
            int prev = 1000;

            for(int i = 0; i < s.length(); i++) {
                total += dict.get(s.charAt(i));
                if(dict.get(s.charAt(i)) > prev) total -= 2*prev;
                prev = dict.get(s.charAt(i));
            }
            return total;
        }
}
