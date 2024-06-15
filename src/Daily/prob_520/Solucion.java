package Daily.prob_520;

import java.util.*;

public class Solucion {


    public static void main(String[] args) {
        System.out.println(new Solucion().findMaximizedCapital(2, 0, new int[]{1,2,3}, new int[]{0, 1, 1}));
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<int[]> projects = new ArrayList<>();
        for (int i = 0; i < profits.length; i++) {
            projects.add(new int[]{capital[i], profits[i]});
        }
        projects.sort(Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> maxProfitHeap = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;
        while (k > 0) {
            while (i < projects.size() && projects.get(i)[0] <= w) {
                maxProfitHeap.add(projects.get(i)[1]);
                i++;
            }

            if (maxProfitHeap.isEmpty()) break;
            w += maxProfitHeap.poll();
            k--;
        }

        return w;

    }


}
