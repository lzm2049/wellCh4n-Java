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
		System.out.print("请输入您的姓名:");
		name = input.next();
		System.out.print("请输入您的身份:");
		type = input.next();
		System.out.print("请输入您的籍贯:");
		place = input.next();
		System.out.print("请输入您的性别:");
		sex = input.next();
		System.out.println("***********信息填写结束***********");
	}

	public void flashcard() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入车费：");
		double oldprice = input.nextDouble();
		double newprice;
		String sale = "";
		if (type.equals("学生")) {
			newprice = oldprice * 0.5;
			sale = "五折";
		} else if (type.equals("军人") || type.equals("残疾人") || type.equals("老人")) {
			newprice = oldprice * 0;
		} else {
			newprice = oldprice * 0.9;
			sale = "九折";
		}
		if (newprice > money) {
			System.out.println("余额不足！");
			lookMoney();
		} else {
			if (sale != "") {
				System.out.println("您的身份：" + type + "，" + sale + "优惠！");
			} else {
				System.out.println("您的身份：" + type + "，" + "乘车免费！");
			}
			System.out.println("本次刷卡为：" + newprice + "元，优惠：" + (oldprice - newprice) + "元");
			money = money - newprice;
			lookMoney();
		}
	}

	public void lookMoney() {
		System.out.println("当前金额为：" + money);
	}

	public void showM() {
		while (flag) {
			System.out.println("***********先锋公交一卡通***********");
			System.out.println("1.充值 2.刷卡 3.个人信息 4.查看 5.退出");
			System.out.print("请选择，操作序号：");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.print("请输入充值金额：");
				double money1 = input.nextDouble();
				inCharge(money1);
				break;
			case 2:
				if (type.equals("")) {
					System.out.println("请先输入个人信息");
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
				System.out.println("退出成功！");
				break;
			default:
				System.out.println("你他妈的输错了知道吗？");
			}
		}
	}

	public void inCharge(double mon) {
		money = money + mon;
		lookMoney();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		AheadBusCard abc = new AheadBusCard();
		abc.showM();
	}

}
