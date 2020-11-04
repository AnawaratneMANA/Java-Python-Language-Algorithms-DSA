package Lab1;

public class Stack {
    //Attributes
    private int TOP;
    private char[] stackArray; //stack array
    private int maxSize; //user define max value

    //Constructor
    public Stack(int S) {
        this.TOP = -1;
        this.maxSize = S;
        this.stackArray = new char[maxSize];
    }

    //Creating manual method for stack operations
    //Creating the push method - Inserting a value
    public void push(char value) {
        if (TOP == maxSize - 1) { // if the stack length is 5 then the last element is at 4th place (5-1).
            System.out.println("Stack is full");
        } else {
            stackArray[++TOP] = value; //Always we have to increment value. (Pre-Incrementation).
        }
    }

    //Creating the pop method - remove elements from the stack
    public char pop() {
        //verify whether the stack is empty or not
        if (TOP == -1) {
            System.out.println("Stack is empty");
            return ' ';
        } else {
            return stackArray[TOP--]; //Once the value is removed we have to do post decrementing.
        }
    }

    //Creating the peek method - Not modifying the stack just getting a value
    public char peek() {
        //Checking whether the stack is empty
        if (TOP == -1) {
            System.out.println("Stack is Empty");
            return ' ';
        } else {
            return stackArray[TOP--];
        }
    }

    //Creating a method isEmpty()
    public boolean isEmpty() {
        if (TOP == -1) {
            return true;
        } else {
            return false;
        }
    }

    //Method 2
/*    public boolean isEmpty()
    {
        return (TOP == -1);
    }*/

    //Creating isFull() Method
    public boolean isFull()
    {
        return(TOP == maxSize-1);
    }
}
