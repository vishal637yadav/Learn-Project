package sourceCode.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SingleLinkedList<K> {
	
	//Inner Class
	class Node<K>
	{
		Node<K>	nextNode;
		K	 	value;
		public Node(){ }
		public Node(K value){ this.value = value; }
		
	}
	
	Node<K>  head;
	Node<K>  tail;
	int 	 size;
	
	public void setSize(int size)
	{
		this.size = size;
	}
	public int getSize()
	{
		return this.size;
	}
	
	public void displaySingleLinkedListData()
	{
		if(head == null){
			System.out.println("SingleLinkList is Empty() "+this.getSize());
		}else
		{
			System.out.println("SingleLinkList size() ::==>> "+this.getSize());
			SingleLinkedList<K>.Node<K> currentNode = head;
			while(currentNode != null)
			{
				System.out.println(currentNode.value+"  -->>-<<--  : Node : "+currentNode+" ! ");
				System.out.println("currentNode.nextNode  "+currentNode.nextNode);
				currentNode = currentNode.nextNode;
			}
		}
	}
	
	public void addLast(K value){
		Node<K> newNode = new Node<K>(value);
		
		if(this.head == null)
		{
			this.head = newNode;
			this.tail = newNode;
		}else
		{
			tail.nextNode = newNode;
			this.tail = newNode;
		}
		this.setSize(size+1);
	}
	
	public void addFirst(K value){
		Node<K> newNode = new Node<K>(value);
		
		if(this.head == null)
		{
			this.head = newNode;
			this.tail = newNode;
		}else
		{
			newNode.nextNode = head;
			head = newNode;
		}
		this.setSize(size+1);
	}
	
	public Node<K> getNthPositionNode(int position)
	{
		Node<K> currentNode = this.head;
		int count = 0;
		System.out.println("SingleLinkList size() ::==>> "+this.getSize());
		while(currentNode != null)
		{
			//count++;
			if(count == position){
				break;
			}
			if(currentNode.nextNode != null)
			currentNode = currentNode.nextNode;
			else
			break;
		}
		return currentNode;
	}
	
	public boolean addAtPosition(int position,K value)
	{
		Node<K> nthPositionNode ;
		if(0< position && position<=this.getSize())
		{
			System.out.println("Proper Position :=> "+position+"  & Size of SingleLinkedList :=> "+this.getSize());
			nthPositionNode = this.getNthPositionNode(position);
			Node<K> newNode = new Node<K>(value);
			newNode.nextNode= nthPositionNode.nextNode ;
			nthPositionNode.nextNode = newNode;
			return true;
		}else
		{
			System.out.println("Invalid Position !! ");
			return false;
		}
	}
	public int find(K value)
	{
		int count = 0;
		SingleLinkedList<K>.Node<K> currentNode = head;
		while(currentNode != null)
		{
			System.out.println("  "+currentNode.value);
			if(currentNode.value.equals(value))
			{
				count = 1;
				System.out.println("Found Found !!");
				break;
			}
			currentNode = currentNode.nextNode;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(" SingleLinkedList");
		// Declare the object and initialize with 
        // predefined standard input object 
		SingleLinkedList<Integer> mylist = new SingleLinkedList<>();
		
		char doYouWantToContinue = 'N';
		Scanner sc = null;
        do
        {
        	System.out.println("Press 1  to AddEnd ");
        	System.out.println("Press 2  to Traversing or Display ");
        	System.out.println("Press 3  to Insert at Begining ");
        	System.out.println("Press 4  to Insert at Specific Position ");
        	System.out.println("Press 5  to Delete at Begining ");
        	System.out.println("Press 6  to Delete at End ");
        	System.out.println("Press 7  to Delete at Specific Position ");
        	System.out.println("Press 8  to Searching ");
        	
        	//Enter data using BufferReader 
            BufferedReader br = 	new BufferedReader(new InputStreamReader(System.in)); 
            System.out.print("You have Choosen or Pressed : ");   
            // Reading data using readLine 
            int myCase = Integer.parseInt(br.readLine()); 
            int position ;
            
            switch(myCase)
            {
	            case 1 :
	            	System.out.println("Case 1");
	            	System.out.println("----------------------------------------------------------------------------------");
	                int element = UserInput.getIntegerInput(); 
	                // Printing the read line 
	                mylist.addLast(element);
	                System.out.println("----------------------------------------------------------------------------------");
	                break;
	                
	            case 2 :
	            	System.out.println("----------------------------------------------------------------------------------");
	                System.out.println("Case 2 Traversing or Display");
	            	mylist.displaySingleLinkedListData();
	                System.out.println("----------------------------------------------------------------------------------");
	                break;
	            
	            case 3 :
	            	System.out.println("Case 3");
	            	System.out.println("----------------------------------------------------------------------------------");
	            	int element3 = UserInput.getIntegerInput(); 
	                // Printing the read line 
	                mylist.addFirst(element3);
	                System.out.println("----------------------------------------------------------------------------------");
	                break;
	            
	            case 4 :
	            	System.out.println("Case 4");
	            	System.out.println("---Enter element, Postion----------------------------------------------------");
	            	element3 = UserInput.getIntegerInput();
	            	position = UserInput.getIntegerInput();
	                // Printing the read line 
	                mylist.addAtPosition(position,element3);
	                System.out.println("----------------------------------------------------------------------------------");
	                break;
	                
	            case 5 :
	            	System.out.println("Case 5");
	            	break;
	            case 6 :
	            	System.out.println("Case 6");
	            	break;
	            case 7 :
	            	System.out.println("Case 7");
	            	break;
	            case 8 :
	            	System.out.println("Case 8");
	            	break;
	            case 9 :
	            	System.out.println("Case 9");
	            	break;
	            default :
	            	System.out.println("Case default");
	        }
            
            sc = new Scanner(System.in); 
            System.out.print("Do you want to Continue :=> "); 
            // Character input 
        	doYouWantToContinue = sc.next().charAt(0); 
            // Print the read value 
            System.out.println("c = "+doYouWantToContinue); 
            
        	
        }while(doYouWantToContinue =='Y' || doYouWantToContinue == 'y');
		/*
		mylist.add(32);
		mylist.add(33);
		mylist.displaySingleLinkedListData();
		System.out.println("this.find(32) :->> "+mylist.find(32));
		System.out.println("this.find(32) :->> "+mylist.find(42));
		*/		
	
	}

}
