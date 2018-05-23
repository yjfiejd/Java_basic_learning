package hello;

import java.util.Scanner;

public class Top_50_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0;
		int sign = 1;
		
		for (int i=1; i < n; i++)
		{
			sum += sign * 1.0/i;
			sign = -sign;
		}
		System.out.println("sum的值为：" + sum);
		System.out.printf("sum的值为：%.2f", sum);

	}

}
