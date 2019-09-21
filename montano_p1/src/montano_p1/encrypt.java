package montano_p1;
import java.util.Scanner;
public class encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1, num2, num3, num4;
		int temp1, temp2;
		int userInput = scnr.nextInt();
		
		//Getting the values
		num4 = userInput % 10;
		num1 = userInput / 1000;
		num3 = (userInput % 100) /10;
		num2 = (userInput / 100) %10;

		//encrypting the values
		num1 = (num1 + 7) % 10;
		num2 = (num2 + 7) % 10;
		num3 = (num3 + 7) % 10;
		num4 = (num4 + 7) % 10;
		
		//swapping the values
		temp1 = num1;
		num1 = num3;
		num3 = temp1;
		
		temp2 = num2;
		num2 = num4;
		num4 = temp2;
		
		//printing
		System.out.printf("%d%d%d%d",num1,num2,num3,num4);

	}

}
	