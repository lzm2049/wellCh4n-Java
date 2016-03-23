package wellCh4n;

import java.util.Scanner;

public class JavaScore {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("输入班级总人数：");
		int num = input.nextInt();
		int i=1;
		double score=0;
		int p=0;
		while(i<=num){
			System.out.print("请输入第"+i+"位学生的成绩：");
			score=input.nextDouble();
			if(score>=80){
				p++;
			}
			i++;
		}
		System.out.println("80分以上的学生人数"+p);
		System.out.print("80分以上的学生所占的比例"+((double)p/(double)num)*100+"%");
	}

}
