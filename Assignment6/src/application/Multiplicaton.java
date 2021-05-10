package application;

import java.util.Scanner;

public class Multiplicaton {
	public static void main(String[]args) {
	int x,y;
Scanner input = new Scanner(System.in);
System.out.print("Enter the first number: ");
	x = input.nextInt();
	System.out.print("Enter the second number: ");
	y = input.nextInt();
	System.out.println(multi(x,y));
	input.close();
}
	public static int multi(int x,int y) {
		if (x > 1)
		{		
			return y + multi(--x, y);
		}
		else
			return y;
		
	}
}