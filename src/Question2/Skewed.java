package Question2;

public class Skewed 
{
	Node newTree;
	Node newHead;
	
	void rightSkewed(Node head)
	{
		if(head==null)
			return;

		rightSkewed(head.left);

		if(newTree==null)
		{
			Node temp=new Node(head.data);
			newTree=temp;
			newHead=newTree;
		}
		else
		{
			Node temp=new Node(head.data);
			newHead.right=temp;
			newHead=newHead.right;
		}	
		
		rightSkewed(head.right);
	}
	
	void display()
	{
		Node temp=newTree;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.right;
		}
	}
}