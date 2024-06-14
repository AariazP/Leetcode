package Daily.prob_867;

public class Solucion {
    public int[][] transpose(int[][] matrix) {

        int[][] aux = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++){

            for(int j=0; j<matrix[i].length; j++){

                aux[j][i] = matrix[i][j];
            }

        }

        return aux;

    }
}
