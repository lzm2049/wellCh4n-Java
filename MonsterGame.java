package wellCh4n;

import java.util.Scanner;

public class MonsterGame {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("***������Ϸ���ֶһ�***");
		System.out.print("���������Ļ���:");
		int score = input.nextInt();
		if(score<2000 && score>=0){
			System.out.println("��ϲ�����õ�һ������");
		}else if(score<5000){
			System.out.println("��ϲ�����õ�һ������");
		}else if(score<8000){
			System.out.println("��ϲ�����õ�һ������ģ��");
		}else{
			System.out.println("��ϲ�����õ�10Ԫ����ȯ");
		}
	}

}
