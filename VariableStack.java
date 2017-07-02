package newPack;

// To implement Stack with varying or dynamically  growing size using the ÄrrayList .
// This class implements Stack interface.
import java.util.ArrayList;

public class VariableStack implements Stack {
	 private ArrayList<Integer> a;// This class uses ArrayList to implement a stack .
	 private int maxSize; // Initial size of the stack

	 public VariableStack(int size)//constructor to populate initial size and to create an ArrayList
	    {
	    	this.maxSize = size;
	       this.a = new ArrayList(size);       //creating an array list with initial size
	    }

	 public boolean isEmpty()//checks whether the Stack is empty.
	    {
	         return a.isEmpty();//Returns if there are no elements in the stack/list
	    }
	 
	 //implementing push operation
	@Override
	public void push(int i) {
		a.add(i);// inserts the Ingeter I to the end of the stack/list.
		
	}

	// implementing pop operation
	@Override
	public int pop() {
		Integer last;
		last = a.remove((a.size()- 1));//As the stack is LIFO, removes the elements from end, by always first getting the current size of the list a.size()
		return (last);// returns the last element removed from the stack/List
	}
	
	// removing and printing all the elements read in LIFO order 
	public void popall()
	{
		while(!this.isEmpty())// check whether the stack/list is empty. If so, exit.
		{
			System.out.println(+this.pop()+ " ");
		}
		
			
	}

}
