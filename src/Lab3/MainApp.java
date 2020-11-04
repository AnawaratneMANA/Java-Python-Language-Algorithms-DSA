package Lab3;

public class MainApp {
    public static void main(String[] args) {
        //Creating Links for the Link List
        Link L1 = new Link("Nipuna", 53.3);
        Link L2 = new Link("Aravinda", 78.0);
        Link L3 = new Link ("Preshani", 69.5);

        //Creating the connections
        //In order to navigate using next this step is required.
        //This is a kind of a manual method.
//         L1.next = L2;
//         L2.next = L3;

         //Calling methods
        //L1.next.next.displayDetails();

        LinkList theList = new LinkList();
        theList.insertFirst("Prashani", 53.3);
        theList.insertFirst("Aravinda", 78.0);
        theList.insertFirst("Nipuna",53.3);

        theList.displayList();

        //theList.deleteFirst();
        //theList.displayList();

        theList.deleteLink("Prashani");
        theList.displayList();
    }
}
