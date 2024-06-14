package Daily.prob_661;

public class Solucion {

    public int[][] imageSmoother(int[][] img) {
        if(img.length == 0 || img[0].length == 0) return new int[0][0];

        int[][] smooth = new int[img.length][img[0].length];


        for(int i=0; i<img.length; i++){

            for(int j=0; j<img[i].length; j++){


                int x = i;
                int y=j;
                int average = img[i][j];
                int count = 1;


                if((x-1)>=0 && (y-1)>=0){
                    average += img[x-1][y-1];
                    count++;
                }if((x-1)>=0 && (y+1)<img[i].length){
                    average += img[x-1][y+1];
                    count++;
                }if((x+1)<img.length && (y-1)>=0){
                    average += img[x+1][y-1];
                    count++;
                }if((x+1)<img.length && (y+1)<img[i].length){
                    average += img[x+1][y+1];
                    count++;
                }if((x-1)>=0){
                    average += img[x-1][y];
                    count++;
                }if((y+1)<img[i].length){
                    average += img[x][y+1];
                    count++;
                }if((x+1)<img.length){
                    average += img[x+1][y];
                    count++;
                }if((y-1)>=0){
                    average += img[x][y-1];
                    count++;
                }

                smooth [i][j] = (int) Math.floor(average/count);

            }


        }



        return smooth;
    }
}
