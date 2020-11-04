package Lab3;

public class Link {
    //Attributes - Values in the Link
    public String name; //Value
    public double average; //Value
    public Link next; //Navigation variable

    //Creating the constructor - when creating user giving the values.
    public Link(String name , double average){
        this.name = name;
        this.average = average;
        this.next = null;
    }
    //Define a display method
    public void displayDetails(){
        System.out.println(name +" " + average);
    }
}
