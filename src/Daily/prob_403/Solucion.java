package Daily.prob_403;

import java.util.HashMap;
import java.util.HashSet;

public class Solucion {
    public boolean canCross(int[] stones) {

        HashMap<Integer, HashSet<Integer>> mapa =new HashMap<>();

        for(int i=0;i<stones.length;i++) mapa.put(stones[i],new HashSet<>());

        mapa.get(stones[0]).add(1);
        int aux = stones.length;

        for (int stone : stones) {

            HashSet<Integer> set = mapa.get(stone);

            for (int j : set) {

                int posicion = stone + j;
                if (posicion == stones[aux - 1]) return true;

                if (mapa.containsKey(posicion)) {

                    if (j - 1 > 0) mapa.get(posicion).add(j - 1);

                    mapa.get(posicion).add(j);
                    mapa.get(posicion).add(j + 1);

                }

            }
        }

        return false;
    }
}
