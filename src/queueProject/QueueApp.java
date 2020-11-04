package queueProject;

import java.util.Scanner;

public class QueueApp {
    public static void main(String[] args) {
        //Creating an object from Queue class
        Queue mainQueue = new Queue(5);
        Queue evenQueue = new Queue(5);
        Queue oddQueue = new Queue(5);
        int value;

        //Creating a Scanner Object
        Scanner CIN = new Scanner(System.in);

        //Getting User input in a loop
        int inputStr;

        for(int A = 1 ; A< 6; A++){
            System.out.print("Enter Transaction ID " + A+ " : ");
            inputStr = Integer.parseInt(CIN.nextLine());
            //Insert the value to the main queue
            mainQueue.insert(inputStr);
        }
        //Testing
        mainQueue.remove();
        mainQueue.insert(6); //this item is not adding to the Queue???

        //Determine whether even or odd then put into appropriate Queue
        while(!mainQueue.isEmpty()){
            value = mainQueue.remove();
            if(value%2 == 0){
                //Even Number
                evenQueue.insert(value);
            } else {
                //Odd number
                oddQueue.insert(value);
            }
        }

        //Printing the values in the even queue and odd queue
        System.out.println("------ PC 1------");
        while(!evenQueue.isEmpty()){
            System.out.println("Transaction ID - " + evenQueue.remove());
        }

        System.out.println("------ PC 2------");
        while(!oddQueue.isEmpty()){
            System.out.println("Transaction ID - " + oddQueue.remove());
        }

        //Check Main queue add and remove together, items are not shifting.
    }
}
