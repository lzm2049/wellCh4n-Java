package wellCh4n;

import java.util.Scanner;

public class Cclter {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("请输入第一个值:");
		double one=input.nextDouble();
		System.out.print("请输入第二个值:");
		double two=input.nextDouble();
		//double rs;
		System.out.println("运算符序号如下\n1.+ 2.- 3.* 4./");
		System.out.print("请选择运算符序号是：");
		int js=input.nextInt();
		switch(js){
		case 1:
			//rs=one+two;
			System.out.println("得到结果："+one+"+"+two+"="+(one+two));
			break;
		case 2:
			//rs=one-two;
			System.out.println("得到结果："+one+"-"+two+"="+(one-two));
			break;
		case 3:
			//rs=one*two;
			System.out.println("得到结果："+one+"*"+two+"="+(one*two));
			break;
		case 4:
			//rs=one/two;
			System.out.println("得到结果："+one+"/"+two+"="+(one/two));
			break;
		}
		
		
	}

}
