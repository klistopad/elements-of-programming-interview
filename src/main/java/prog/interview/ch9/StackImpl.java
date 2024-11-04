package prog.interview.ch9;

import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;

public class StackImpl<T extends Comparable<T>> implements  Stack<T> {
    private LinkedList<T> list = new LinkedList<>();
    private NavigableSet<T> navigableSet = new TreeSet<>();

    public T max;

    @Override
    public void push(T val) {
        list.push(val);
        navigableSet.add(val);
    }

    @Override
    public T peek() {
        return list.peek();
    }

    @Override
    public T pop() {
        T val = list.pop();
        navigableSet.remove(val);
        return val;
    }

    @Override
    public T max() {
        if (navigableSet.isEmpty()){
            return null;
        }
        return navigableSet.getLast();
    }
}
