import java.util.Scanner;
public class average
{
	public static void main(String[] args)
	{
		double sum=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Count of numbers");
		int N=sc.nextInt();
		int[] numbers=new int[N];
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter the number");
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			try
			{
				if(numbers[i]>=0)
				{
					sum+=numbers[i];
					count++;
				}
				else
				{
					throw new negative_exception("Negative number: "+numbers[i]);
				}
			}
			catch(negative_exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		if(count>0)
		{
			double avg=sum/count;
			System.out.println("Average of Positive Numbers="+avg);
		}
		else
		{
		System.out.println("No positive numbers entered.");
		}
	}
}
