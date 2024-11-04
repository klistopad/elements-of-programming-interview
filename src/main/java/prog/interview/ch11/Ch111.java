package prog.interview.ch11;

import java.util.*;

public class Ch111 {

    public List<Integer> mergeSortedSources(List<Iterator<Integer>> sortedSources){
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.data));
        List<Integer> mergedSource = new ArrayList<>();

        for (Iterator<Integer> source : sortedSources){
            if (source.hasNext()){
                priorityQueue.add(new Node(source.next(), source));
            }
        }

        while (!priorityQueue.isEmpty()){
            Node tmp = priorityQueue.poll();
            mergedSource.add(tmp.data);

            if (tmp.source.hasNext()){
                priorityQueue.add(new Node(tmp.source.next(), tmp.source));
            }
        }
        return mergedSource;
    }

    public static class Node{
        public Integer data;
        public Iterator<Integer> source;

        public Node(Integer data, Iterator<Integer> source) {
            this.data = data;
            this.source = source;
        }
    }
}
