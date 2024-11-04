package prog.interview.ch10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch101Test {

    @Test
    void isBalanced() {
        BinaryTreeNode<Integer> node10 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> node15 = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node0 = new BinaryTreeNode<>(0);

        node10.addLeft(node5);
        node10.addRight(node15);
        node5.addLeft(node1);
        node5.addRight(node0);

        Assertions.assertFalse(new Ch101().isBalanced(node10));
    }
}