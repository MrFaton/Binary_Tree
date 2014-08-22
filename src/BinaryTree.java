/**
 * Created by root on 18.08.2014.
 */
public class BinaryTree {
    public static TreeNode root = new TreeNode(5, null, null);
    static int i = 0;

    public static void main(String[] args) {
        makeTree(6, 7, 4, 2, 3, 1);
        i = 0;
        System.out.println("Колличество всех элементов в дереве = " + size(root));
        i = 0;
        System.out.println("Сумма всех элементов дерева = " + sum(root));
        i = 0;
        System.out.println("Максимальное значение среди всех элементов в дереве = " + max(root));
        i = 0;
        System.out.println("Максимальная высота дерева = " + height(root));
        showTree(root);
    }

    public static TreeNode makeTree(int... values) {
        for (int i = values.length - 1; i >= 0; i--) {
            inseart(values[i], root);
        }
        return root;
    }

    public static TreeNode inseart(int value, TreeNode nodeList) {
        if (value < nodeList.value) {
            if (nodeList.left == null) {
                nodeList.left = new TreeNode(value, null, null);
            } else {
                inseart(value, nodeList.left);
            }
        } else {
            if (nodeList.right == null) {
                nodeList.right = new TreeNode(value, null, null);
            } else {
                inseart(value, nodeList.right);
            }
        }
        return nodeList;
    }

    public static Integer size(TreeNode list) {
        if (list != null) {
            i++;
            size(list.left);
            size(list.right);
        }
        return i;
    }

    public static Integer sum(TreeNode list) {
        if (list != null) {
            i += list.value;
            sum(list.left);
            sum(list.right);
        }
        return i;
    }

    public static Integer max(TreeNode list) {
        if (list != null) {
            if (i < list.value) {
                i = list.value;
            }
            max(list.left);
            max(list.right);
        }
        return i;
    }

    public static Integer height(TreeNode list) {
        System.out.println("надо почитинь");
        return 0;
    }

    public static String showTree(TreeNode tree) {
        if (tree != null) {
            String left = (tree.left == null ? "нет" : "" + tree.left.value);
            String right = (tree.right == null ? "нет" : "" + tree.right.value);
            System.out.println("Корень: " + tree.value + ", левая ветка: " + left + ", правая ветка: " + right);
            showTree(tree.left);
            showTree(tree.right);
        }
        return "1";
    }
}
