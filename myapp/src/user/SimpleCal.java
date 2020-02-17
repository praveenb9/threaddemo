package user;

import java.util.Scanner;

public class SimpleCal {

	public boolean palindrome(String num) {
		boolean flag = false;
		StringBuffer sb = new StringBuffer(num);
		StringBuffer sb2 = sb.reverse();
		String s1 = sb2.toString();
		flag = num.equals(s1);
		return flag;
	}

	public int factorial(int num) {
		
		int fact = 1;
		for (int i = 1; i <= num; i++) 
		{
			fact = fact * i;
		}
return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleCal obj = new SimpleCal();
		System.out.println("Enter a string");
		String str1 = sc.nextLine();
		boolean flag = obj.palindrome(str1);
		System.out.println(flag);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int fact=obj.factorial(num);
		System.out.println("factorial of " + num + " is " + fact);
	}

}
