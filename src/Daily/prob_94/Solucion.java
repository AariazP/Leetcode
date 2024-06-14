package Daily.prob_94;

import java.util.ArrayList;
import java.util.List;

public class Solucion {

    public List<Integer> inorderTraversal(TreeNode root) {

        if(root == null) return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        return inorderTraversal(root, list);

    }

    public static List<Integer> inorderTraversal(TreeNode root, ArrayList<Integer> list) {


        if(root.left != null){
            inorderTraversal(root.left, list);
        }
        list.add(root.val);
        if(root.right != null){
            inorderTraversal(root.right, list);
        }

        return list;

    }
}
