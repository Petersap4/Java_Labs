import java.util.Scanner;

public class Queue {

	int maxSize;
	int nItems;
	int front;
	int rear;
	long [] queueArray;
	
	Queue(int maxSize)
	{
		this.maxSize = maxSize;
		queueArray = new long[maxSize];
		nItems=0;
		front = 0;
		rear = -1;
	}
	
	void insert(long element)
	{
		if(!isFull())
		{
			rear++;
			queueArray[rear] = element;
			nItems++;
		}
		else
			System.out.println("Queue is full!");
	}
	
	void remove()
	{
		if(!isEmpty())
		{
			queueArray[front] = 0;
			front++;
			nItems--;
		}	
		else
			System.out.println("Queue is empty!");
	}
	
	boolean isEmpty()
	{
		if(nItems==0)
			return true;
		else return false;
		/*boolean emp = true;
		for(int i = front; i<rear; i++)
		{
			if(queueArray[i]!=0)
			{
				emp = false;
				break;
			}
		}
		return emp;*/		
	}
	
	boolean isFull()
	{
		if(nItems== maxSize)
			return true;
		else return false;
	}
	
	int size()
	{
		return nItems;
	}
	
	long peek()
	{
		return queueArray[front];
	}
	
	void printQueue()
	{
			
		for(int i = front; i<=rear; i++)
		{
			if(isEmpty())
				break;
			if(i==rear)
				System.out.print(queueArray[i]);
			else
				System.out.print(queueArray[i] + ", ");
		}
	}
	
	public static void main(String[] args) 
	{
		Queue newQueue = new Queue(6);
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i<6; i++)
		{
			newQueue.insert(scn.nextLong());		
			//newQueue.queueArray[i] = scn.nextLong();
		}
		newQueue.remove();
		
		newQueue.printQueue();
		scn.close();
	}
}
