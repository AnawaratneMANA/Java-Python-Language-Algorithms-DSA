public class Tree {
    //Part c
    private Node root;

    //Creating method
    public void insert(int emp, String name){

        //Create a new Node
        Node newNode = new Node();

        //Insert values to the Node
        newNode.EmpNo = emp; //Assigning EmpNo
        newNode.name = name; //Assigning name

        //Checking whether the tree is having a value or not
        if(root == null){
            root = newNode; /*If the  root is empty then we assigning the
                                node we created.*/
        } else {
            /*we have to navigate through the
            entire tree to determine the place.
             */
            Node current = root;
            Node parent;

            while (true){ //infinite loop
                parent = current;
                if(emp < current.EmpNo){ //If true, go left
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                } else { //right side, EmpNo is greater.
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
                //Will this insert method work if the numbers are  shuffled?
            }
        }
    }

    //Creating the inOrder method -- this method is a Recursive method act like a typical for loop.
    private void inOrder(Node localRoot){
        if(localRoot != null){ //Null means the end of the branch.
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }

    public void TraverseinOrder(){ //These are act like triggering methods.
        inOrder(root);
    }

    //Creating preOrder method
    private void preOrder(Node localRoot){ // root, left, right
        if(localRoot !=null) {
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
    //Public method
    public void TraversepreOrder(){
        preOrder(root);
    }

    //Creating postOrder method
    private void postOrder(Node localRoot){
        if(localRoot!=null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }

    //public method to access postOrder method
    public void TraversepostOrder(){
        postOrder(root);
    }

    //Creating findRecursive method
    private Node findRecursive(Node localRoot, int emp) { //What is the exact use of this method!?
        if (localRoot == null) {
            return null;
        } else if (localRoot.EmpNo == emp) { //If the localRoot number is matching with what we are checking.
            System.out.println(localRoot.name);
            return localRoot;
        } else if (emp < localRoot.EmpNo) {
            return findRecursive(localRoot.leftChild, emp);
        } else {
            return findRecursive(localRoot.rightChild, emp);
        }
    }
    public Node callRecursive(int eno){
        return findRecursive(root, eno);
    }

    //creating the findMethod - Not a recursive method
    public Node find(int emp){
        Node current = root;
        while (current.EmpNo != emp){
            if( emp < current.EmpNo){
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            //Checking whether current is NULL
            if( current == null){
                return null; //value can't be find. Terminate inside the loop
            }
        } //when find the element go out of the loop

        System.out.println(current.name );
        return current;
    }

    //Creating the deleteAll method
    public void deleteAll(){
        root = null; //what about the created object they are remaining!!?
    }

    //Note we either can use find method or findRecursive method.

    /*Which one of those methods are more efficient!?*/


}
