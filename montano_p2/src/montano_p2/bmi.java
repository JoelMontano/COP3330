package montano_p2;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("For U.S. System press 1, for Metric System press 2");
		int choice = scnr.nextInt();
		double height, weight, bmi;
		
	
		if (choice == 1)
		{
			System.out.println("You chose U.S System");
			System.out.println("Enter your height in inches");
			height = scnr.nextDouble();
			System.out.println("Enter your weight in pounds");
			weight = scnr.nextDouble();
			bmi = (703 * weight) / Math.pow(height,2);
			if (bmi < 18.5 )
			{
				System.out.printf("Your BMI is %f and you are considered underweight", bmi);
			}
			else if (bmi >= 18.5 && bmi <= 24.9)
			{
				System.out.printf("Your BMI is %f and you are considered normal weight", bmi);
			}
			else if (bmi >= 25 && bmi <= 29.9)
			{
				System.out.printf("Your BMI is %f and you are considered overweight", bmi);
			}
			else if (bmi >= 30)
			{
				System.out.printf("Your BMI is %f and you are considered obese", bmi);
			}
		}
		
		else if (choice == 2)
		{
			System.out.println("You chose Metric System");
			System.out.println("Enter your height in meters");
			height = scnr.nextDouble();
			System.out.println("Enter your weight in kg");
			weight = scnr.nextDouble();
			bmi = weight / Math.pow(height, 2);
			if (bmi < 18.5 )
			{
				System.out.printf("Your BMI is %f and you are considered underweight", bmi);
			}
			else if (bmi >= 18.5 && bmi <= 24.9)
			{
				System.out.printf("Your BMI is %f and you are considered normal weight", bmi);
			}
			else if (bmi >= 25 && bmi <= 29.9)
			{
				System.out.printf("Your BMI is %f and you are considered overweight", bmi);
			}
			else if (bmi >= 30)
			{
				System.out.printf("Your BMI is %f and you are considered obese", bmi);
			}
		}
			
	}


}
