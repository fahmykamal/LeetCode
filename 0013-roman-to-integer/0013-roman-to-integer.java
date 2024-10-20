import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public int romanToInt(String s) {
         Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int total = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            if (i < n - 1 && romanToInt.get(s.charAt(i)) < romanToInt.get(s.charAt(i + 1))){
                total -= romanToInt.get(s.charAt(i));
            } else {
                total += romanToInt.get(s.charAt(i));
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Solution converter = new Solution();
        System.out.println(converter.romanToInt("III"));
        System.out.println(converter.romanToInt("LVIII"));
        System.out.println(converter.romanToInt("MCMXCIV"));
    }
}