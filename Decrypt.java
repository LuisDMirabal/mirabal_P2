package mirabalp1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter number to be decrypted: ");
		
		int number = scnr.nextInt();
		
		
		int decrypted;
		int temp;
		int thousand = (number / 1000) % 10;
		int hundred = (number / 100) % 10;
		int ten = (number / 10) % 10;
		int one = number % 10;
		
		temp = thousand;
		thousand = ten;
		ten = temp;
		temp = hundred;
		hundred = one;
		one = temp;
		
		if(thousand < 7)
		{
			thousand = thousand + 3;
		}
		
		else
		{
			thousand = thousand - 7;
		}
		
		if(hundred < 7)
		{
			hundred = hundred + 3;
		}
		
		else
		{
			hundred = hundred - 7;
		}
		
		if(ten < 7)
		{
			ten = ten + 3;
		}
		
		else
		{
			ten = ten - 7;
		}
		
		if(one < 7)
		{
			one = one + 3;
		}
		
		else
		{
			one = one - 7;
		}
		
		
		decrypted = (thousand * 1000) + (hundred * 100) + (ten * 10) + one;
		
		System.out.println(decrypted);
		
		scnr.close(); 
	}

}
