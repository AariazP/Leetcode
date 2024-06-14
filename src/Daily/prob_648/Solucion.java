package Daily.prob_648;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solucion {

    public String replaceWords(List<String> dictionary, String sentence) {
        ArrayList<String> diccionario = new ArrayList<>(dictionary);
        diccionario.sort(Comparator.naturalOrder());

        String[] words = sentence.split(" ");
        StringBuilder response = new StringBuilder();

        for (String word : words) {

            boolean add = true;

            for (String key : diccionario) {

                if ((key.length() < word.length()) && word.substring(0, key.length()).toLowerCase().equals(key)) {
                    response.append(key).append(" ");
                    add = false;
                    break;
                }

            }

            if (add)
                response.append(word).append(" ");

        }

        return response.toString().trim();

    }

}
