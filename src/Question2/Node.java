package Question2;

public class Node 
{
	int data;
	Node left,right;
	
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
	Node()
	{
		data=0;
		left=right=null;
	}
	Node newNode(int data)
	{
		Node temp=new Node();
		temp.data=data;
		return temp;
	}
}