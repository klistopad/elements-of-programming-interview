package prog.interview.ch10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch102Test {

    @Test
    void isSymmetric_true() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(20);

        BinaryTreeNode<Integer> node10_1 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> node10_2 = new BinaryTreeNode<>(10);

        BinaryTreeNode<Integer> node15_1 = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> node15_2 = new BinaryTreeNode<>(15);

        BinaryTreeNode<Integer> node1_1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node1_2 = new BinaryTreeNode<>(1);

        root.addLeft(node10_1);
        root.addRight(node10_2);

        node10_1.addLeft(node15_1);
        node10_2.addRight(node15_2);

        node10_1.addRight(node1_1);
        node10_2.addLeft(node1_2);

        Assertions.assertTrue(new Ch102().isSymmetric(root));
    }

    @Test
    void isSymmetric_false() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(20);

        BinaryTreeNode<Integer> node10_1 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> node10_2 = new BinaryTreeNode<>(10);

        BinaryTreeNode<Integer> node15_1 = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> node15_2 = new BinaryTreeNode<>(15);

        BinaryTreeNode<Integer> node1_1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node1_2 = new BinaryTreeNode<>(1);

        root.addLeft(node10_1);
        root.addRight(node10_2);

        node10_1.addLeft(node15_1);
        node10_2.addRight(node15_2);

        node10_1.addRight(node1_1);
//        node10_2.addLeft(node1_2);

        Assertions.assertFalse(new Ch102().isSymmetric(root));
    }
}