package academy.learnprogramming.solveIt;

public class QueueArray {
    private int[] arr;
    private int topOfQueue;
    private int beginningOfQueue;

    public QueueArray() {
    }

    public void createQueue(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with size " + size);
    }

    public boolean isFull() {
        return topOfQueue == arr.length-1;
    }

    public boolean isEmpty() {
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    public void enQueue(int value ){
        if(isFull()) {
            System.out.println("Queue is full");
        }else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " is added at the top of the queue");
        }else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " is added at the top of the queue");
        }
    }

    public int peek() {
        if(isEmpty()) {
            return beginningOfQueue;
        } else {
            return arr[beginningOfQueue];
        }
    }

    public int deQueue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } else{
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue == topOfQueue) {
                System.out.println("Queue is empty");
                return -1;
            }
            return result;
        }
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("The queue is deleted successfully");
    }
}
