package sourceCode.company.amdocs;

import java.lang.reflect.Array;

public class MyLinkListRotation<E>
{
		
	public static void main(String[] args)throws Exception
	{
		
		MyLinkListRotation<Integer> list = new MyLinkListRotation<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.diplayList();
		System.out.println("   : "+list.getSize());
		list.rotateList(4);
		System.out.println("----------after Rotation------------");
		list.diplayList();
		
	}
	
	
	Node<E> head;
	int size ;
	
	public int getSize()
	{
		return this.size;
	}
	public void add(E data)
	{
		Node<E> newNode = new Node<E>(data,null);
		
		if(this.head == null)
		{
			this.head = newNode;
		}else
		{
			Node<E> currentNode = this.head,lastNode = null;
			
			while(true)
			{
				//System.out.println("current Node"+currentNode);
				if(currentNode.nextNode ==null)
				{	lastNode = currentNode;
					break;
				}
				else
				{
					currentNode = currentNode.nextNode;
				}
			}
			lastNode.nextNode = newNode;
		}
		size++;
	}
	
	public void rotateList(int n) throws Exception
	{
		if(n>this.size)
			throw new Exception("Invalid Input, Rotation size cann't be greater than Array Size");
		else
		{
			System.out.println("");
			E storeData[] = (E[]) Array.newInstance(Object.class, this.size);
			E rotatedData[] = (E[]) Array.newInstance(Object.class, this.size);
			
			int count = 0;
			Node<E> currentNode = this.head;
			while(true)
			{
				//System.out.println("current Node :"+currentNode);
				storeData[count++]=currentNode.data;
				if(currentNode.nextNode ==null)
				{	
					break;
				}
				else
				{
					currentNode = currentNode.nextNode;
				}
			}
			
			int storeDataIndex= 0;
			for(int i = n;i<rotatedData.length;i++)
			{
				rotatedData[i]=storeData[storeDataIndex++];
			}
			for(int i = storeDataIndex ,j=0;i<storeData.length;i++,j++)
			{
				rotatedData[j]=storeData[i];
			}
			
			
			for(E a : storeData)
				System.out.println("storeData "+a);
			
			for(E a : rotatedData)
				System.out.println("rotatedData "+a);
			
			getRotatedList(rotatedData);
			
		}
			
	}
	public void diplayList()
	{
		Node<E> currentNode = this.head;
		
		while(true)
		{
			System.out.println("--current Node :"+currentNode);
			if(currentNode.nextNode ==null)
			{	
				break;
			}
			else
			{
				currentNode = currentNode.nextNode;
			}
		}
	}
	
	public MyLinkListRotation<E> getRotatedList(E rotatedData[])
	{
		System.out.println("----");
		Node<E> currentNode = this.head;
		int count=0;
		while(true)
		{
			System.out.println("current Node :"+currentNode);
			
			currentNode.data = rotatedData[count++];
			
			if(currentNode.nextNode ==null)
			{	
				break;
			}
			else
			{
				currentNode = currentNode.nextNode;
			}
		}
		
		return this;
	}
	
}

class Node<E>
{
	E data;
	Node<E> nextNode;
	
	public E getData()
	{
		return data;
	}
	@Override
	public String toString()
	{
		return "Node [data=" + data + ", nextNode=" + nextNode + "]";
	}
	public Node(){}
	public Node(E data, Node<E> nextNode)
	{
		super();
		this.data = data;
		this.nextNode = nextNode;
	}
	public void setData(E data)
	{
		this.data = data;
	}
	public Node<E> getNextNode()
	{
		return nextNode;
	}
	public void setNextNode(Node<E> nextNode)
	{
		this.nextNode = nextNode;
	}
	
}

