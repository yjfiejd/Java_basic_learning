//一： 枚举的方法，有点笨
//二： 辗转相除法
package hello;

import java.util.Scanner;

public class Greatest_common_divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("请输入n的值：");
		int n = in.nextInt();
		System.out.print("请输入m的值：");
		int m = in.nextInt();
		
		int k = 1;
		
		if (n < m)
		{
			for (int i = 2; i <= n; i ++)
			{
				if (n % i == 0 && m % i == 0)
				{
					System.out.println(i);
					k = i;
					
				}
				
			}
			System.out.println("最大公约数k的值是：" + k);
		}
		else
		{
			for (int i = 2; i <= m; i++)
			{
				if (m % i == 0 && n % i == 0)
				{
					System.out.println(i);
					k = i;
				}
			}
			System.out.println("最大公约数k的值是：" + k);
		}

	}
}



////可以换另外一种思路，无需比较n 与 m的大小
////for (int i = 2; i <= n && i <= m; i++) 表示i在他们里面，完美！
//Scanner in = new Scanner(System.in);
//int n = in.nextInt();
//int m = in.nextInt();
//int result = 1;
////当他们没有公约数的时候，最后输出为1
//
//for ( int i = 2; i <= n && i <= m; i++)
//{
//	if (n % i == 0 && m % i == 0)
//	{
//		result = i;
//	}
//}
//System.out.println("最大公约数为 result = " + result)

//第二种算法：辗转相除法


