package wellCh4n;

import java.util.Scanner;

public class MonsterGame {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("***怪兽游戏积分兑换***");
		System.out.print("请输入您的积分:");
		int score = input.nextInt();
		if(score<2000 && score>=0){
			System.out.println("恭喜您，得到一个牙膏");
		}else if(score<5000){
			System.out.println("恭喜您，得到一个杯子");
		}else if(score<8000){
			System.out.println("恭喜您，得到一个汽车模型");
		}else{
			System.out.println("恭喜您，得到10元电子券");
		}
	}

}
