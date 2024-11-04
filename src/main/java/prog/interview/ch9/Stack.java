package prog.interview.ch9;

public interface Stack<T extends Comparable<T>> {
    void push(T val);

    T peek();

    T pop();

    T max();
}
