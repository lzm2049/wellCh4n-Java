package wellCh4n;

import java.util.Scanner;

public class JavaScore {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.print("����༶��������");
		int num = input.nextInt();
		int i=1;
		double score=0;
		int p=0;
		while(i<=num){
			System.out.print("�������"+i+"λѧ���ĳɼ���");
			score=input.nextDouble();
			if(score>=80){
				p++;
			}
			i++;
		}
		System.out.println("80�����ϵ�ѧ������"+p);
		System.out.print("80�����ϵ�ѧ����ռ�ı���"+((double)p/(double)num)*100+"%");
	}

}
