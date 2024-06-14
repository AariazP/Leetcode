package Daily.prob_3;

import java.util.HashSet;
import java.util.Set;

public class Solucion {

    public static void main(String[] args) {
        System.out.println(new Solucion().lengthOfLongestSubstring("asadascascsc"));
    }


    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> uniqueChars = new HashSet<>();

        while (end < s.length()) {
            char c = s.charAt(end);
            if (uniqueChars.contains(c)) {
                maxLength = Math.max(maxLength, end - start);
                while (s.charAt(start) != c) {
                    uniqueChars.remove(s.charAt(start));
                    start++;
                }
                start++;
            } else {
                uniqueChars.add(c);
            }
            end++;
        }

        maxLength = Math.max(maxLength, end - start);
        return maxLength;
    }
}
