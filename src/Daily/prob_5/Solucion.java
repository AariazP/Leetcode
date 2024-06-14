package Daily.prob_5;

public class Solucion {

    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        String subPal = "";
        for(int i=0; i<s.length(); i++){

            String sAux = s.substring(i,s.length());

            while (sAux.contains(s.charAt(i)+"")) {

                if(isPalindrome(sAux+s.charAt(i))){

                    sAux = sAux+s.charAt(i);
                    break;

                }else{

                    sAux = sAux.substring(sAux.indexOf(s.charAt(i)), sAux.lastIndexOf(s.charAt(i)));

                }

            }

            if(sAux.length()>subPal.length() && s.contains(sAux)) subPal=sAux;

        }
        if(subPal.isEmpty()) subPal = s.charAt(0)+"";
        return subPal;
    }

    public boolean isPalindrome(String cadena){
        return new StringBuilder(cadena).reverse().toString().equals(cadena);
    }
}
