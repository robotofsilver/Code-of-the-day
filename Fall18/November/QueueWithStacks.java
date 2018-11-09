public class QueueWithStacks {
  private int[] aQueue;

  public static void main(String[] args) {
    /*
    Queues are a data structure that follows the convention of first in first out, behaving exactly like a line at a supermarket.
    The first person in the line will be the first to be served.
    Stacks are another data structure that follows a different convention of first in last out, where it behaves like a stack of dishes.
    Only the top most dish will be used, and the first dish in a stack is the last to be used.
    
    For this practice, write a class named QueuePoll that returns the first item in a queue utilizing only stacks.
    You may use array provided functionalities, but do not simply return the first index as your method, that is cheeky.
    You are permitted to use more than one stack if needed.
    We have also provided a stack class that provides the four functionalities of a stack, 
      but you may use java's provided stack class if you wish.
    */
    
    aQueue = {4, 12, 9, 32, 99}; //This is our Queue, the front is at index 0 and the rear as at index 4. We will remove from the front and add to the rear.
    int frontElement = QueuePoll(); //This will store our front element obtained from the QueuePoll function.
    System.out.println(frontElement);
  }
  
  
}
  //Add your QueuePoll class below this line. Include your name above the method you added.

class QueuePoll //Martin Lennan's queue
{
	MyStack stackPile;
	MyStack queuePile;
	boolean isStack;
	
	public QueuePoll(int size)
	{
		stackPile = new stack(size);
		queuePile = new stack(size);
		isStack = true;
	}
	
	public void enqueue(int num)
	{
		if (!isStack)
		{
			flipStacks();
		}
		stackPile.push(num);
	}
	
	public int dequeue()
	{
		if (isStack)
		{
			flipStacks();
		}
		return queuePile.pop();
	}
	
	public int peek()
	{
		if (isStack)
		{
			flipStacks();
		}
		return queuePile.peek();
	}
	
	public boolean isEmpty()
	{
		if (isStack)
		{
			return stackPile.isEmpty();
		}
		return queuePile.isEmpty();
	}
	
	private void flipStacks()
	{
		if (isStack)
		{
			while (!stackPile.isEmpty())
			{
				queuePile.push(stackPile.pop());
			}
		}
		else
		{
			while (!queuePile.isEmpty())
			{
				stackPile.push(queuePile.pop());
			}
		}
	}	
}
