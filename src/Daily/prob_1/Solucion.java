package Daily.prob_1;

import java.util.Arrays;

public class Solucion {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solucion().twoSum(new int[]{2, 7, 11, 15}, 9)));

    }

    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for(int i=0; i<nums.length; i++){

            for(int j=0; j< nums.length; j++){

                if( i!=j && nums[i] + nums[j] == target){
                    indices[0]=i;
                    indices[1]=j;
                    return indices;
                }

            }

        }
        return indices;
    }
}
