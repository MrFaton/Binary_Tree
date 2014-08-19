/**
 * Created by root on 18.08.2014.
 */
public class BinaryTree {
    public static TreeNode root=new TreeNode(5, null, null);
    public static void main(String[] args) {
        makeTree(6,7,4,2,3);
        showTree(root);
    }

    public static TreeNode makeTree(int... values){
        for (int i=values.length-1; i>=0; i--){
            inseart(values[i], root);
        }
        return root;
    }

    public static TreeNode inseart(int value, TreeNode nodeList){
        if (value<nodeList.value){
            if (nodeList.left==null){
                nodeList.left=new TreeNode(value, null, null);
            } else {
                inseart(value, nodeList.left);
            }
        } else {
            if(nodeList.right==null){
                nodeList.right=new TreeNode(value, null,null);
            } else {
                inseart(value, nodeList.right);
            }
        }
        return nodeList;
    }

    public static String showTree(TreeNode tree){
        if(tree!=null){
            String left=(tree.left==null ? "нет" : ""+tree.left.value);
            String right=(tree.right==null ? "нет" : ""+tree.right.value);
            System.out.println("Корень: "+tree.value+", левая ветка: "+left+", правая ветка: "+right);
            showTree(tree.left);
            showTree(tree.right);
        }
        return "1";
    }
}
