import java.util.*;
public class totoloto {
	
	public static int getRand()
	{
		Random randomo = new Random();
		return (randomo.nextInt(49)+1);
	}
	
	public static boolean checkCloned(int[] numbers,int number)
	{
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==number) {
				return true;
			}
		}
		return false;
	}
	
	public static void printNumbers(int[] numbers)
	{
		int n=0;
		while(n<5) {
			System.out.println("Number" + (n+1) +" : " + numbers[n]);
			n++;
		}
	}
	
	public static int[] getRandoms()
	{
		int numbers[]=new int[5];
		int number;
		int n =0;
		boolean clone;
		while(n<5)
		{
			number=getRand();
			clone=checkCloned(numbers,number); 
			if(clone)
				continue;
			numbers[n]=number;
			n++;
		
		}
		Arrays.sort(numbers);
		return numbers;
	}
	
	public static boolean checkBets(int Bets[][],int newBet[])
	{
		for(int i=0;i<Bets.length;i++)
		{
			if(newBet==Bets[i])
				return true;
		}
		return false;
	}
	
	public static void printBets(int Bets[][])
	{
		for(int i=0;i<Bets.length;i++) 
		{
			System.out.println("Bet number : " + (i+1) + " ====================================");
			printNumbers(Bets[i]);
		}
	}
	
	public static void getBets()
	{
		int newBet[];
		int nOfBets;
		Scanner input=new Scanner(System.in);
		System.out.println("How many bets you want to make?");
		nOfBets=input.nextInt();
		input.close();
		int Bets[][]=new int[nOfBets][];
		for(int i=0;i<nOfBets;) 
			{
			newBet=getRandoms();
			if(checkBets(Bets,newBet))
				continue;
			Bets[i]=newBet;
			i++;
			}
		printBets(Bets);
		}
	
	public static void main(String[] args)
	{
	getBets();
	}
}
