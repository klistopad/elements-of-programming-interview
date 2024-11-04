package prog.interview.ch10;

import java.util.Objects;

public class Ch102 {

    public boolean isSymmetric(BinaryTreeNode<Integer> root){
        return isNodeSymmetric(root.left, root.right);
    }

    private boolean isNodeSymmetric(BinaryTreeNode<Integer> leftNode, BinaryTreeNode<Integer> rightNode){
        System.out.println("leftNode: " + leftNode.data);
        System.out.println("rightNode: " + rightNode.data);
        if (!Objects.equals(leftNode.data, rightNode.data)){
            return false;
        }

        if (leftNode.left != null && rightNode.right == null){
            return false;
        }

        if (leftNode.left == null && rightNode.right != null){
            return false;
        }

        if (leftNode.right != null && rightNode.left == null){
            return false;
        }

        if (leftNode.right == null && rightNode.left != null){
            return false;
        }

        if (leftNode.left != null){
            if (!isNodeSymmetric(leftNode.left, rightNode.right)){
                return false;
            }
        }

        if (leftNode.right != null){
            return isNodeSymmetric(leftNode.right, rightNode.left);
        }

        return true;
    }
}
