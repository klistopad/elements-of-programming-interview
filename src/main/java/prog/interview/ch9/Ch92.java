package prog.interview.ch9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Ch92 {
    public int evaluateExpression(List<String> expr){
        Deque<Integer> deque = new LinkedList<>();

        for (String val : expr){
            switch (val){
                case "+": {
                    deque.push(deque.pop() + deque.pop());
                }
                break;
                case "*": {
                    deque.push(deque.pop() * deque.pop());
                }
                break;
                case "-": {
                    Integer tmp = deque.pop();
                    deque.push(deque.pop() - tmp);
                }
                break;
                case "/": {
                    Integer tmp = deque.pop();
                    deque.push(deque.pop() / tmp);
                }
                break;

                default: deque.push(Integer.valueOf(val));
            }
        }

        return deque.pop();
    }
}
