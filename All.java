package wellCh4n;

import java.util.Scanner;

public class All {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input =new Scanner(System.in);
		System.out.print("请输入n的值：");
		int i=input.nextInt();
		double some=0;
		double all=0;
		if (i%2==0){
			System.out.print("n为偶数，公式之和：");
			for(double k=2;k<=i;k=k+2){
				some=1/k;
				System.out.print("1/"+(int)k);
				if(k<i)
					System.out.print("+");
				all=all+some;
			}
		}else{
			System.out.print("n为奇数，公式之和：");
			for(double k=1;k<=i;k=k+2){
				some=1/k;
				System.out.print("1/"+(int)k);
				if(k<i)
					System.out.print("+");
				all=all+some;
			}
		}
		System.out.println("="+all);
	}

}
