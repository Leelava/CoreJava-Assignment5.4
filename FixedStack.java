package newPack;

import java.util.Scanner;

// As the array size is fixed, the array is used here to implement the Stack operation.

public class FixedStack implements Stack {
	private int stackSize ; // max no of elements that can be inserted into the stack.
	private int[] stackArray;// Array whose size does not grow during runtime.
	private int upperElement;// Top most element in the array to track the last in element of the stack.
	
    // constructor to create a Fixed size stack
	public FixedStack(int size)
	{
		this.stackSize = size;
		stackArray =  new int[size];
		upperElement = -1;
	}
	
	@Override
	//implementation for push operation
	public void push(int i) {
		
    	 stackArray[++upperElement]= i;//always inserted at the end.
   	
	}
    // implementation for pop operation
	@Override
	public int pop() {
		return(stackArray[upperElement--]);//Returning last element always
	}
	

	public boolean isFull(){
		return(upperElement == stackSize-1);// Returns true if the size of the stack has reached the maximum, else false.
		
	}
	//Checks whether all the elements are popped out
	public boolean isEmpty()
	{
		return(upperElement == -1);//checks if the index is -1 which indicates the stack is empty.
		
	}
	public void popall()
	{
		//pops and displays all the elements from the top till the index becomes -1.
		while(!this.isEmpty())
		{
			System.out.print(+this.pop() + " " );
		}
	}
}
