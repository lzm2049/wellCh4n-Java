package wellCh4n;

import java.util.Scanner;

public class All {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input =new Scanner(System.in);
		System.out.print("������n��ֵ��");
		int i=input.nextInt();
		double some=0;
		double all=0;
		if (i%2==0){
			System.out.print("nΪż������ʽ֮�ͣ�");
			for(double k=2;k<=i;k=k+2){
				some=1/k;
				System.out.print("1/"+(int)k);
				if(k<i)
					System.out.print("+");
				all=all+some;
			}
		}else{
			System.out.print("nΪ��������ʽ֮�ͣ�");
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
