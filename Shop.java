package wellCh4n;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.println("***先锋饮料旋风机***\n有以下产品");
		System.out.println("1.百事可乐\t3元\n2.橙汁\t\t3.5元\n3.矿泉水\t\t2元\n4.脉动\t\t4元");
		System.out.print("请你选择的产品序号：");
		int num=input.nextInt();
		double cost=0;
		String name="";
		switch(num){
		case 1:
			cost=3;
			name="百事可乐";
			break;
		case 2:
			cost=3.5;
			name="橙汁";
			break;
		case 3:
			cost=2;
			name="矿泉水";
			break;
		case 4:
			cost=4;
			name="脉动";
			break;
		default:
			System.out.println("不输入不行");
		}
		System.out.print("请你选择的产品数量:");
		int sl=input.nextInt();
		double all=cost*sl;
		System.out.println("你购买的产品："+name+" "+sl+"瓶");
		System.out.println("共付金额："+all+"元");
		
		
		
	}

}
