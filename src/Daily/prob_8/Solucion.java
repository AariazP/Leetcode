package Daily.prob_8;

public class Solucion {

    public static void main(String[] args) {

        System.out.println(new Solucion().myAtoi("20000000000000000000"));

    }

    public int myAtoi(String s) {


        if (!s.isEmpty()) {
            int i = 0;
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }

            if (i != 0) s = s.substring(i, s.length());
        }


        StringBuilder num = new StringBuilder();


        for (char c : s.toString().toCharArray()) {

            if (Character.isDigit(c)) num.append(c);
            else if ((c == '+' || c == '-') && !num.toString().contains(c + "") && (num.isEmpty())) {
                num.append(c);
            } else {
                break;
            }

        }

        try {
            long l = Long.parseLong(num.toString());
            if (l > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (l < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            return Integer.parseInt(l + "");
        } catch (NumberFormatException n) {
            return 0;
        }

    }

}
