package wellCh4n;

import java.util.Scanner;

public class AheadBusCard {
	double money;
	String name;
	String type = "";
	String place;
	String sex;
	boolean flag = true;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.print("��������������:");
		name = input.next();
		System.out.print("�������������:");
		type = input.next();
		System.out.print("���������ļ���:");
		place = input.next();
		System.out.print("�����������Ա�:");
		sex = input.next();
		System.out.println("***********��Ϣ��д����***********");
	}

	public void flashcard() {
		Scanner input = new Scanner(System.in);
		System.out.print("�����복�ѣ�");
		double oldprice = input.nextDouble();
		double newprice;
		String sale = "";
		if (type.equals("ѧ��")) {
			newprice = oldprice * 0.5;
			sale = "����";
		} else if (type.equals("����") || type.equals("�м���") || type.equals("����")) {
			newprice = oldprice * 0;
		} else {
			newprice = oldprice * 0.9;
			sale = "����";
		}
		if (newprice > money) {
			System.out.println("���㣡");
			lookMoney();
		} else {
			if (sale != "") {
				System.out.println("������ݣ�" + type + "��" + sale + "�Żݣ�");
			} else {
				System.out.println("������ݣ�" + type + "��" + "�˳���ѣ�");
			}
			System.out.println("����ˢ��Ϊ��" + newprice + "Ԫ���Żݣ�" + (oldprice - newprice) + "Ԫ");
			money = money - newprice;
			lookMoney();
		}
	}

	public void lookMoney() {
		System.out.println("��ǰ���Ϊ��" + money);
	}

	public void showM() {
		while (flag) {
			System.out.println("***********�ȷ湫��һ��ͨ***********");
			System.out.println("1.��ֵ 2.ˢ�� 3.������Ϣ 4.�鿴 5.�˳�");
			System.out.print("��ѡ�񣬲�����ţ�");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.print("�������ֵ��");
				double money1 = input.nextDouble();
				inCharge(money1);
				break;
			case 2:
				if (type.equals("")) {
					System.out.println("�������������Ϣ");
				} else {
					flashcard();
				}
				break;
			case 3:
				input();
				break;
			case 4:
				lookMoney();
				break;
			case 5:
				flag = false;
				System.out.println("�˳��ɹ���");
				break;
			default:
				System.out.println("������������֪����");
			}
		}
	}

	public void inCharge(double mon) {
		money = money + mon;
		lookMoney();
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		AheadBusCard abc = new AheadBusCard();
		abc.showM();
	}

}
