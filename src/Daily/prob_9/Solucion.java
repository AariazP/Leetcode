package Daily.prob_9;

public class Solucion {

    public boolean isPalindrome(int x) {
        String number = x+"";
        StringBuilder reverse = new StringBuilder(number);
        return reverse.reverse().toString().equals(number);
    }
}
