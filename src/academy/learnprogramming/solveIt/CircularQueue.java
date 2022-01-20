package academy.learnprogramming.solveIt;

public class CircularQueue {
    private int[] arr;
    private int topOfQueue;
    private int beginningOfQueue;
    private int size;

    public CircularQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("created a queue with size of " + size);
    }

    public boolean isFull() {
        if(topOfQueue+1 == size && beginningOfQueue == 0) {
            return true;
        }else return topOfQueue + 1 == beginningOfQueue;
    }

    public boolean isEmpty() {
        return beginningOfQueue == -1;
    }

    public void enQueue(int value) {
        if(isFull()){
            System.out.println("Queue is Full");
        }else if(isEmpty()){
            beginningOfQueue =0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+value+" i the queue");
        } else {
            if(topOfQueue+1 == size) {
                topOfQueue = 0;
            }else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+value+" i the queue");
        }
    }

    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int res = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if(beginningOfQueue == topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }else if(beginningOfQueue + 1 == size){
                beginningOfQueue = 0;
            }else {
                beginningOfQueue++;
            }
            return res;
        }
    }
}
