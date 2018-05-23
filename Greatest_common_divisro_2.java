package hello;

import java.util.Scanner;

public class Greatest_common_divisro_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入a的值：");
		int a = in.nextInt();
		System.out.println("请输入b的值：");
		int b = in.nextInt();
		int oa = a;
		int ob = b;
//		辗转相除法
		while (b != 0)
		{
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.println(oa + "和" + ob + "的最大公约数是：" + a) ;
	}

}
