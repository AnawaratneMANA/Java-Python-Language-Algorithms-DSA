public class Main {
    public static void main(String[] args) {

        //Creating a tree object
        Tree T1 = new Tree();

        //Insert values to the Object
        T1.insert(149, "Anusha");
        T1.insert(150, "Kosala");
        T1.insert(160,"Dinusha");
        T1.insert(124, "Nirmith");
        T1.insert(147,"Akash");

        System.out.println("InOrder(Left, Root, Right)");
        T1.TraverseinOrder();

        System.out.println("preOrder (Root, Left, Right)");
        T1.TraversepreOrder();

        System.out.println("postOrder (Left, Right, Root)");
        T1.TraversepostOrder();

        T1.find(147);


    }
}
