public class Testcases {
    public static void main(String[] args) {
        String[] romanNumbers = {"III", "LVIII", "MCMXCIV", "MMMDCCXXIV"};
        for (String number : romanNumbers) {
            System.out.println(number + " is: " + RomanNumeralConverter.toInt(number));
        }
    }
}
