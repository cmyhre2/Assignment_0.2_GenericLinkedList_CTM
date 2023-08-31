/**
 * This class creates Nodes of any generic type data.
 * 
 * @author njohnson3 (v1.0) & Chris Myhre (v1.1)
 * @version 1.1 (CS-215 Module 0 Assignment 0.2)
 * Fall 2023 (08/31/2023)
 */
class Node<T> {
	T data;//data variable of generic type T to store a specified data type
	Node<T> nextNode;//generic Node type variable to tackthe next node after any given node
	
	/*
	 * default constructor to create a Node type object
	 */
	public Node()
	{
		nextNode=null;
		data=null;
	}//end Node()
	
	/**
	 * This method sets the type T data of the object, type T = choosen data type upon instantiation.
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData()
	
	/**
	 * This method returns itself to the caller. 
	 * @return
	 */
	public Node<T> getNode() {
		return this;
	}//end getNode()
	
	/**
	 * This method updates the pointer for the next type T node.
	 * @param nextNode
	 */
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode()
}//end Node class
