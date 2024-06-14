package Daily.prob_1051;

import java.util.Arrays;

public class Solucion {
    public int heightChecker(int[] heights) {
        int[] arrSort = heights.clone();
        Arrays.sort(heights);
        int count =0;
        for(int i=0; i<heights.length; i++ ){
            if(arrSort[i] != heights[i]) count++;
        }
        return count;
    }
}
