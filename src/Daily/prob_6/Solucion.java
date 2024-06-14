package Daily.prob_6;

import java.util.ArrayList;
import java.util.List;

public class Solucion {


    public String convert(String s, int numRows) {
        // Casos base donde no hay necesidad de conversión
        if (numRows == 1 || numRows >= s.length()) return s;

        // Crear una lista de StringBuilder para cada fila
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Recorrer la cadena y añadir cada carácter a la fila correspondiente
        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        // Unir todas las filas en una sola cadena de resultado
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
