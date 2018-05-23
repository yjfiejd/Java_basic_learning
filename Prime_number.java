package hello;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("请输入数字：");
		int n = in.nextInt();
		int isPrime = 1;
		
		for ( int i=2; i<n; i++)
		{
			if (n % i == 0)
			{
				isPrime = 0;
				System.out.println(n + "不是素数, i =" + i);
				break;
			}
		}
		if (isPrime == 1)
		{
			System.out.println(n + "是素数");
		} 
		else
		{
			System.out.print(n + "不是素数");
		}
	}

}
