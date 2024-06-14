package Daily.prob_26;

import java.util.Arrays;

public class Solucion {

    public int removeDuplicates(int[] nums) {
        int[] nums2 = Arrays.stream(nums).distinct().toArray();
        for(int i = 0; i < nums2.length; i++){
            nums[i] = nums2[i];
        }
        return nums2.length;
    }
}
