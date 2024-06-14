package Daily.prob_1122;

import java.util.*;

public class Solucion {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Lista para la respuesta
        List<Integer> result = new ArrayList<>();

        // Añadir elementos de arr2 según su orden y frecuencia
        for (int num : arr2) {
            if (countMap.containsKey(num)) {
                for (int i = 0; i < countMap.get(num); i++) {
                    result.add(num);
                }
                countMap.remove(num);  // Eliminar del mapa una vez procesado
            }
        }

        // Lista para los elementos restantes que no están en arr2
        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                remaining.add(entry.getKey());
            }
        }

        // Ordenar los elementos restantes
        Collections.sort(remaining);

        // Añadir los elementos restantes al resultado final
        result.addAll(remaining);

        // Convertir la lista resultante a un array
        int[] response = result.stream().mapToInt(i -> i).toArray();

        return response;
    }
}
