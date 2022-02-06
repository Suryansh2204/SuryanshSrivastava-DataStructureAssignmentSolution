package Question1;
import java.util.*;

public class constructionOrder 
{
	private LinkedList<Integer> floor;
	private int sortedAr[];
	private int size;

	constructionOrder(LinkedList<Integer> floor, int size)
	{
		this.floor=floor;
		this.size=size;
		sortedAr= new int[size]; 
		llToArray_sorted(floor);
		display();
	}
	
	private void llToArray_sorted(LinkedList<Integer> head)
	{
		for(int x=0;x<size;x++)
		{
			sortedAr[x]=head.get(x);
		}
		for(int x=0;x<size-1;x++)
		{
			for(int y=0;y<size-1;y++)
			{
				if(sortedAr[y]<sortedAr[y+1])
				{
					int temp=sortedAr[y];
					sortedAr[y]=sortedAr[y+1];
					sortedAr[y+1]=temp;
				}
			}
		}
	}
	
	private void display()
	{
		System.out.println("The order of construction is as follows");
		int s=0,a=0;
		while(a<size)
		{
			System.out.println("Day "+(a+1)+" :");
			if(sortedAr[s]==floor.get(a))
			{
				System.out.print(floor.get(a));
				s++;
				for(int x=0;x<=a;x++)
				{
					for(int y=0;y<=a;y++)
					{
						if(s<size && sortedAr[s]==floor.get(y))
						{
							System.out.print(" "+sortedAr[s]);
							s++;
						}
					}
				}
			}
			a++;
			System.out.println();
		}
	}
}
