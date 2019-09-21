package montano_p3;

import java.util.Scanner;

public class poll {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int max;
		String topCat = "";
		int min;
		String botCat = "";
		double sum[] = {0,0,0,0,0};
		double avg[] = {0,0,0,0,0};
		String[] topics = {"Home  ", "Family", "Job   ", "Money ", "Food  "};
		int[][] responses;
		responses = new int[5][10];
		int[][] summary;
		summary = new int[5][11];
		
		//init the table
		for(int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 11; j++)
			{
				summary[i][j] = 0;
			}
		}
		
		//getting responses and filling out the table
		for(int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.printf("How would person %d rate %s from 1-10?",j+1, topics[i]);
				responses[i][j] = scnr.nextInt();
				summary[i][responses[i][j]] += 1;
			}
		}
		
		//getting the avgs for each category
		for(int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				sum[i] += (responses[i][j]);
			}
			avg[i] = sum[i]/5;	
		}
		//max category
		max = (int) sum[0];
		for (int i = 1; i<5;i++)
		{
			if(sum[i] > max)
			{
				max = (int)sum[i];
				topCat = topics[i];	
			}	
		}
		if(max == sum[0])
			topCat = "Home";
		
		//min category
		min = (int) sum[0];
		for (int i = 1; i<5; i++)
		{
			if(sum[i] < min)
			{
				min = (int)sum[i];
				botCat = topics[i];
			}
		}
		
		if(min == sum[0])
			botCat = "Home";

	System.out.println("Category  1 2 3 4 5 6 7 8 9 10 Avg");
	
	for (int i = 0; i<5; i++) 
	{
	System.out.printf("%s   ",topics[i]);
		for (int j = 1; j<11 ;j++)
		{
			System.out.printf(" %d",summary[i][j]);
		}
	System.out.printf("  %.2f", avg[i]);
	System.out.println("");
	}
	System.out.printf("%s is the top category with %d total\n", topCat, max);	
	System.out.printf("%s is the bot category with %d total", botCat, min);	


	}
}


