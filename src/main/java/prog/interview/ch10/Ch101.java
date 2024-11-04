package prog.interview.ch10;

public class Ch101 {
    public boolean isBalanced(BinaryTreeNode<Integer> root){
        int leftDepth = traverseAndFindMaxDepth(root.left);
        int rightDepth = traverseAndFindMaxDepth(root.right);

        System.out.println("leftDepth: " + leftDepth);
        System.out.println("rightDepth: " + rightDepth);

        return leftDepth == rightDepth;
    }

    private int traverseAndFindMaxDepth(BinaryTreeNode<Integer> node){
        if (node.left != null){
            return traverseAndFindMaxDepth(node.left);
        }
//        System.out.println(node.data);
        if (node.right != null){
            return traverseAndFindMaxDepth(node.right);
        }

        int depth = 0;
        BinaryTreeNode<Integer> currentNode = node;
        while (currentNode.parent != null){
            depth++;
            currentNode = currentNode.parent;
        }
        return depth;
    }
}
