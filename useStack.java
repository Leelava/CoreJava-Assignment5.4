package newPack;

//Function to manage the Fixed Stack which throws the message when the size is exceeded.
import java.util.Scanner;

public class useStack {
	////Function to manage the Fixed size stack which calls all the methods in FixedStack.
	
public static void FixedStackUse()
{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Read in the size of the stack");
		
		int maxSize = s.nextInt();
		
		FixedStack fs = new FixedStack(maxSize);//construct the fixed stack with size specified by the user. 
		
		do
			{
			System.out.println("Read in the Integer number to push into the stack");
			
		
			int stackElement = s.nextInt();
			
			fs.push(stackElement);// calling push() method to push the stack element.
			}
			
	   while(!fs.isFull());//check whether the max size reached.If so, exit or else continue
		
	   System.out.println(" Sorry,Stack over flow,no more insertion possible.");
	   System.out.println("The Stack elements popped out in LIFO orader are");
	   fs.popall();
	   
}
		
//Function to manage the Variable Stack which grows dynamically.	
public  static void VariableStackUse()
	{
		Scanner k=new Scanner(System.in);
		System.out.println("");
		System.out.println("Read in the initial size of the Variable Stack");
	
		int maxSize = k.nextInt();
	
		VariableStack vs =new VariableStack(maxSize);// create the stack with initial size specified by the user
		//loop to read and push the elements of the stack with initial size specified by the user. 
			for (int i=0; i<maxSize; i++)
			{
				System.out.println("Readin the Integer number to push into the stack");
		
				int stackElement =k.nextInt();
		
				vs.push(stackElement);//push each integer read 
			}
	
		System.out.println("Exceeded the initial size ,if you want to continue pls specify the no of elements to push into the stack or type -1 for no");
	
		int extraSize = k.nextInt();
		
	//loop to push the extra elements as per the extra size specified by the user. 
			for (int i=0; i<extraSize; i++)
			{
				System.out.println("Readin the Integer number to push into the stack");
		
		
				int stackElement =k.nextInt();
		
				vs.push(stackElement);
			}
	
		System.out.println("The elements of the stack popped out in LIFO manner are");
		// this is to pop all the elements push into stack in LIFO manner
		vs.popall();
}

	
	public static void main(String[] args)
	{
		System.out.println("To push and pop integer number into FixedStack");
		FixedStackUse();		
		System.out.println("To push and pop interger numbers into Varying size Stack");
		VariableStackUse();
	}
	
}
