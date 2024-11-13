package prog.interview.ch20;

public class Ch203 {
    private final Object lock = new Object();
    private int currentVal;
    private final int maxVal;

    public Ch203(int maxVal) {
        this.maxVal = maxVal;
    }

    public boolean printVals() throws Exception {

        Runnable odd = () -> {
            printByCondition(0);
        };

        Runnable even = () -> {
            printByCondition(1);
        };

        Thread oddT = new Thread(odd, "odd");
        Thread evenT = new Thread(even, "even");

        oddT.start();
        evenT.start();

        oddT.join();
        evenT.join();

        System.out.println("done");
        return true;
    }

    private void printByCondition(int condition) {
        synchronized (lock){
            while (currentVal < maxVal) {
                if (currentVal % 2 == condition){
                    System.out.printf("currentVal: %,d; thread: %s;%n", currentVal, Thread.currentThread().getName());
                    currentVal++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
