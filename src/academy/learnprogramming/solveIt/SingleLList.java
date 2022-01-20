package academy.learnprogramming.solveIt;

public class SingleLList {
    private int value;
    private SingleLList next;

    public SingleLList(){
    }

    public SingleLList(int value){
        this.value = value;
        this.next = null;
    }

    public SingleLList(int value, SingleLList next) {
        this.value = value;
        this.next = next;
    }
    public void addNode(int value){
        SingleLList newNode = new SingleLList(value);

    }
}
