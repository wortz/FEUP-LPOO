import java.util.*;
public class totoloto {
	
	
	
	public static void getRandoms()
	{
		int numbers[]=new int[5];
		Random randomo = new Random();
		int number;
		int n =0;
		boolean clone=false;
		while(n<5)
		{
			clone=false;
			number=(randomo.nextInt(48)+1);
			for(int i=0;i<numbers.length;i++)
			{
				if(numbers[i]==number) {
					clone=true;
					break;
				}
			}
			if(clone)
				continue;
			numbers[n]=number;
			n++;
		
		}
		n=0;
		while(n<5) {
			System.out.println("Number" + (n+1) +" : " + numbers[n]);
			n++;
		}
	}
	
	public static void main(String[] args)
	{
	getRandoms();
	}
}
