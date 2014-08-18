/**
 * Created by root on 18.08.2014.
 */
public class BinaryTree {
    public static TreeNode root=new TreeNode(5, null, null);
    public static void main(String[] args) {
        makeTree(2,6,8,10,15,17);
        showTree(root);
    }

    public static TreeNode makeTree(int... values){
        for (int i=values.length-1; i>=0; i--){
            inseart(values[i], root);
        }
        return root;
    }

    public static TreeNode inseart(int value, TreeNode nodeList){
        if (nodeList.value>value){
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

    public static TreeNode showTree(TreeNode tree){
        if ()
    }
}
