package hello;

import java.util.Scanner;

public class _100_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		System.out.println("请输入数字：");
//		int n = in.nextInt();
		for (int n = 2; n < 100; n++ )
		{
			int isPrime = 1;
			for (int i = 2; i < n; i++)
			{
				if (n % i == 0)
				{
					isPrime = 0;
//					System.out.println(n + " 不是素数， i = " + i);
					break;
				}
			}
			if (isPrime == 1)
			{
				System.out.print( n + " ");
			}
			else
			{
//				System.out.println(n + "不是素数");
			}
		}
	}

}
