package sourceCode.company.amdocs;


public class RotateLinkedListApproch2
{

	public static void main(String[] args)
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
		list = RotateLinkedListApproch2.makeCyclicList(list,2);
		System.out.println("--------------");
		list.diplayList();
		
	}

	public static <E> MyLinkListRotation<E> makeCyclicList(MyLinkListRotation<E> list,int rotationCnt)
	{
		Node<E> currentNode = list.head,lastNode = null;
		
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
		//puting the pointer of first node in the last node
		lastNode.nextNode = list.head;
		
		int headPosition = list.size-(rotationCnt -1);
		int lastNodePosition = headPosition -1;
		int count = 1;
		Node<E> newlastNode = null;
		
		while(true)
		{
			//System.out.println("current Node"+currentNode);
			if(count == lastNodePosition)
			{	
				newlastNode = currentNode ;
			}
			else 
			if(count== headPosition)
			{
				list.head = currentNode;
				newlastNode.nextNode = null;
				break;
			}else
			{
				currentNode = currentNode.nextNode;
			}
			count++;
		}
		
		return list;
	}
}