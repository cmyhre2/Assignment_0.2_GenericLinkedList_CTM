/**
 * This class creates linked lists of Node type objects.
 * 
 * @author njohnson3 (v1.0) & Chris Myhre (v1.1)
 * @version 1.1 (CS-215 Module 0 Assignment 0.2)
 * Fall 2023 (08/31/2023)
 */
public class LinkedList<T> {
	
	Node<T> head; //Type T node to represent the head of the list
	int length; //int variable to keep track of the number of elements in the list
	Node<T> tail; //Type T node to represent the tail (end) of the list
	
	/*
	 * default constructor to creating a LinkedList type object
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end LinkedList()
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty()
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * @return head
	 */
	public Node<T> getList()
	{
		return head;
	}//end getList()
	
	/**
	 * This method adds a new type T node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param aNode
	 */
	public void addNode(Node<T> aNode)
	{
		if (isEmpty() ) { //if statement to check if the Linked List is empty
			head = aNode;
			tail=head;
			return;
		}//end if statement that checked if a list is empty and sets head to the node passed in
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}//end addNode()
}//end LinkedList() class