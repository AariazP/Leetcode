package Daily.prob_945;

public class Solucion {

    public int minIncrementForUnique(int[] nums) {
        Integer[] arr = new Integer[1000000];
        int count = 0;
        for(int num : nums){
            if(arr[num] != null){

                int i = 0;
                while (true){
                    i++;
                    if( ((num+i)<arr.length) && arr[num+i] == null){
                        arr[num+i] = num;
                        break;
                    }


                }
                count+=i;
            }else {
                arr[num] = num;
            }
        }
        return count;
    }
}
