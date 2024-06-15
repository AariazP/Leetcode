package Daily.prob_2264;
public class Solucion {


    public static void main(String[] args) {
        System.out.println(new Solucion().largestGoodInteger("3200014888"));
    }


    public String largestGoodInteger(String num) {


        String max ="";

        for(int i=0; i<num.length()-2; i++){


            String s = num.substring(i, i+3);

            if(s.contentEquals(new StringBuilder(s).reverse()) &&
                s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2)){

                if(max.isEmpty()) max=s;
                else{
                    if(Integer.parseInt(s)>Integer.parseInt(max)){
                        max = s;
                    }
                }
            }

        }

        return max;

    }

}
