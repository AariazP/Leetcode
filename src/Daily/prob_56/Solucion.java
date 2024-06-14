package Daily.prob_56;

public class Solucion {

    public int lengthOfLastWord(String s) {
        return (s.split(" ")[s.split(" ").length-1]).length();
    }
}
