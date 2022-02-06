package Question1;
import java.util.*;
public class Driver 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int n=sc.nextInt();
		LinkedList<Integer> floor=new LinkedList<Integer>();
		for(int x=0;x<n;x++)
		{
			System.out.print("Enter the floor size given on day "+(x+1)+" : ");
			floor.addLast(sc.nextInt());
		}
		constructionOrder ob=new constructionOrder(floor,n);
	}
	
}
