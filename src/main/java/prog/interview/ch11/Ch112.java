package prog.interview.ch11;

import java.util.*;

public class Ch112 {

    public List<Integer> sort(List<Integer> list, int step){
        List<Integer> sorted = new ArrayList<>();

        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

        List<Iterator<Integer>> sources = splitBySources(list, step);

        for (Iterator<Integer> itr : sources){
            queue.add(new Node(itr.next(), itr));
        }

        while (!queue.isEmpty()){
            Node node = queue.poll();
            sorted.add(node.val);

            if (node.source.hasNext()){
                queue.add(new Node(node.source.next(), node.source));
            }
        }
        return sorted;
    }

    private List<Iterator<Integer>> splitBySources(List<Integer> list, int step){
        int increaseStep = step / 2 + 1;

        List<Iterator<Integer>> sources = new ArrayList<>();

        for (int i = 0; i < list.size(); i += step){
            sources.add(list.subList(i, i + increaseStep).iterator());
            sources.add(list.subList(i + increaseStep, i + step).reversed().iterator());
        }

        return sources;
    }

    private static class Node{
        public Integer val;
        public Iterator<Integer> source;

        public Node(Integer val, Iterator<Integer> source) {
            this.val = val;
            this.source = source;
        }
    }
}
