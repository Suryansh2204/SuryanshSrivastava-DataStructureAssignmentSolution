package Question2;

class Main
{
	public static void main(String args[])
	{
		Node tree=new Node(50);
		tree.left=tree.newNode(30);
		tree.right=tree.newNode(60);
		tree.left.left=tree.newNode(10);
		tree.left.right=tree.newNode(33);
		tree.right.left=tree.newNode(55);
		Skewed ob=new Skewed();
		ob.rightSkewed(tree);
		ob.display();
	}
}
