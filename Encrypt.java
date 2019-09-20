package mirabalp1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		
		int number = scnr.nextInt();
		
		int encrypted;
		int thousand = ((number / 1000) +7) % 10;
		int hundred = ((number / 100) + 7) % 10;
		int ten = ((number / 10) + 7) % 10;
		int one = (number + 7) % 10;
		
		encrypted = (ten * 1000) + (one * 100) + (thousand * 10) + hundred;
		
		System.out.println(encrypted);
		
		scnr.close(); 

	}

}
