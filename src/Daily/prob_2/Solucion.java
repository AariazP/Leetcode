package Daily.prob_2;

import java.math.BigInteger;

public class Solucion {
    public static void main(String[] args) {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger l1Number = convertNodes(l1);
        BigInteger l2Number = convertNodes(l2);

        BigInteger sum = l1Number.add( l2Number);

        String sumAux = String.valueOf(sum);

        ListNode result = new ListNode();
        ListNode aux = result;

        for(int i = sumAux.length()-1; i>=0; i--){

            result.val = Integer.parseInt(String.valueOf(sumAux.charAt(i)));
            if(i == 0) break;
            result.next =new ListNode();
            result = result.next;

        }

        return aux;


    }

    private BigInteger convertNodes(ListNode l1) {

        String aux = "";
        ListNode listNodeAux = l1;

        while (listNodeAux != null){
            aux = "" + listNodeAux.val + aux;
            listNodeAux = listNodeAux.next;

        }
        return new BigInteger(aux);

    }
}
