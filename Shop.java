package wellCh4n;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		System.out.println("***�ȷ����������***\n�����²�Ʒ");
		System.out.println("1.���¿���\t3Ԫ\n2.��֭\t\t3.5Ԫ\n3.��Ȫˮ\t\t2Ԫ\n4.����\t\t4Ԫ");
		System.out.print("����ѡ��Ĳ�Ʒ��ţ�");
		int num=input.nextInt();
		double cost=0;
		String name="";
		switch(num){
		case 1:
			cost=3;
			name="���¿���";
			break;
		case 2:
			cost=3.5;
			name="��֭";
			break;
		case 3:
			cost=2;
			name="��Ȫˮ";
			break;
		case 4:
			cost=4;
			name="����";
			break;
		default:
			System.out.println("�����벻��");
		}
		System.out.print("����ѡ��Ĳ�Ʒ����:");
		int sl=input.nextInt();
		double all=cost*sl;
		System.out.println("�㹺��Ĳ�Ʒ��"+name+" "+sl+"ƿ");
		System.out.println("������"+all+"Ԫ");
		
		
		
	}

}
