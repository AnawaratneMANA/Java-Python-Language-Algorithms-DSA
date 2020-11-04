package Lab1;

import java.util.Scanner;

public class stackApplication {
    public static void main(String[] args) {
/*        //Add or Remove Values.
        Stack stack = new Stack(5);
        //Adding Items to the stack.
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');

        System.out.println("Item in the TOP - " + stack.peek());

        //Removing Items
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }*/

        //Create a Scanner class
        Scanner CIN = new Scanner(System.in);
        System.out.print("Enter a String -");
        String string = CIN.nextLine();

        //Getting the length of the given Expression
        int length = string.length();

        //Creating the stack.
        Stack stack = new Stack(length);

        //Looping
        for(int x=0; x<length; x++){
            char character = string.charAt(x);
            if(character == '('){
                stack.push(character);
            } else if(character == ')') {
                char character2 = stack.pop();
                if(character2 != '('){
                    System.out.println("Invalid String");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }



    }
}
