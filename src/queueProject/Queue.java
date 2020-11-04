package queueProject;
//Rear should be reset to 0 after coming to the last???
public class Queue {
    //Variables
    private int[] queueArray;
    private int maxSize;
    private int rear;
    private int front;
    private int noItem; //Determine the number of items.

    //Constructor
    public Queue(int size){
        this.maxSize = size;
        queueArray= new int[maxSize];
        front = 0;
        rear = -1;
        noItem = 0;
    }

    //Creating methods
    public void insert(int j) {
        if(rear == maxSize-1){
            System.out.println("Queue is full");
        } else {
            queueArray[++rear] = j; //Pre-Incrementing.
            noItem++;
        }
    }

    //Creating removal method
    public int remove(){
        //Checking a whether the que is empty.
        if(noItem == 0)
        {
            System.out.println("Queue is empty.");
            return -99;
        }else{
            noItem--;
            return queueArray[front++];
        }
    }

    public boolean isEmpty(){
        //Condition
        if(noItem == 0){
            return true;
        } else{
            return false;
        }
    }

    public boolean isFull(){
        //Condition
        if(noItem == maxSize){
            return true;
        } else {
            return false;
        }
    }
}
