package Lab3;

public class LinkList {
    private Link first;

    //Constructor
    public LinkList(){
        first = null;
    }

    //Create Link Controlling methods
    public boolean isEmpty(){ //this will return true if the list is empty
        return(first == null);
    }

    //inserting values for the first
    public void insertFirst(String name, double average){
        //Step 1 - Create the link
        Link newLink = new Link(name, average);

        //Step 2 - Link the Newlink with the existing link list
        newLink.next = first;

        //Step 3 - Make the new Link as the first link in the link list
        first = newLink;
    }

    //Deletefirst method
    public Link deleteFirst(){
        Link temp = first; //save the reference of the current fist to the Temp
        first = first.next; // change the current first references to the next link
        //return the old  first reference
        return temp;

    }

    //A method to display the Link data
    public void displayList(){
        System.out.println("List from first link to the last link");
        Link current = first; //start from the first link of the list.
        while(current !=  null){
            current.displayDetails();// display the details

            //increment the current value
            current = current.next; //move the current value to the next value.
        }
    }

    public Link deleteLink (String name){
        //Link controller variables
        Link current = first;
        Link previous = first;

        //Going through all the links
        while(current.name != name){ //Checking the name until find.
            if(current.next == null){
                return null;
            } else {
                //Increment the current and the previous pointers.
                previous = current;
                current = current.next;
            }
        }
        if(current == first){
            first = first.next; //What exactly happen here??
        } else {
            previous.next = current.next;
            return current;
        }
        //returns null when we don't found it in the link list
        return null;

    }
}

