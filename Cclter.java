package wellCh4n;

import java.util.Scanner;

public class Cclter {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("�������һ��ֵ:");
		double one=input.nextDouble();
		System.out.print("������ڶ���ֵ:");
		double two=input.nextDouble();
		//double rs;
		System.out.println("������������\n1.+ 2.- 3.* 4./");
		System.out.print("��ѡ�����������ǣ�");
		int js=input.nextInt();
		switch(js){
		case 1:
			//rs=one+two;
			System.out.println("�õ������"+one+"+"+two+"="+(one+two));
			break;
		case 2:
			//rs=one-two;
			System.out.println("�õ������"+one+"-"+two+"="+(one-two));
			break;
		case 3:
			//rs=one*two;
			System.out.println("�õ������"+one+"*"+two+"="+(one*two));
			break;
		case 4:
			//rs=one/two;
			System.out.println("�õ������"+one+"/"+two+"="+(one/two));
			break;
		}
		
		
	}

}
