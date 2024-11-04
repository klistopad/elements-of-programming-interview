package prog.interview.ch10;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> parent;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

    public void addLeft(BinaryTreeNode<T> node){
        this.left = node;
        node.parent = this;
    }
    public void addRight(BinaryTreeNode<T> node){
        this.right = node;
        node.parent = this;
    }
}
