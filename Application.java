/**
 * This class creats & uses instances of the Node & LinkedList classes.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 0 Assignment 0.2)
 * Fall 2023 (08/30/2023)
 */
public class Application {
	public static void main(String[] args) {
		LinkedList<Integer> myList=new LinkedList<Integer>();
		
		Node<Integer> aNode=new Node<Integer>(); //creates a new Integer type Node
		aNode.setData(1); //sets the node to 1
		myList.addNode(aNode); //adds the node to the linked list of type Integer
		aNode = new Node<Integer>(); //creates another node
		aNode.setData(2); //sets the new node's data to 2
		myList.addNode(aNode); //adds the new node to the linked list
		
		Node<Integer> tempnode=myList.getList(); //gets the list of nodes
		do //do-while loop to print out all nodes in the linked list
		{
			System.out.println("Node data:" + " " + tempnode.data); //prints out the current node
			tempnode=tempnode.nextNode; //sets the tempnode variable to the next node
		} while (tempnode!=null); //stops the do-while loop when the while condition is no longer true
	}//end main()
}//end Application() class
