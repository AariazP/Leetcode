package Daily.prob_409;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solucion {

    public int longestPalindrome(String s) {
        List<Character> chars = s.chars()
                .mapToObj(c -> (char) c)
                .toList();

        Map<Character, Long> repeticiones = chars.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int length = repeticiones.values().stream()
                .mapToInt(Long::intValue)
                .map(c -> c / 2 * 2)
                .sum();

        boolean esImpar = repeticiones.values().stream()
                .anyMatch(c -> c % 2 == 1);

        if (esImpar)length += 1;

        return length;
    }
}
