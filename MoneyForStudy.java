package wellCh4n;

public class MoneyForStudy {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int year=1;
		double fourYearMoney = 0;
		while(year<=10){
			double everyYearMoney=400*Math.pow((1+0.05), year);
			System.out.println("第"+year+"年学费为"+everyYearMoney);
			if(year>=1&&year<=4){
				fourYearMoney=fourYearMoney+everyYearMoney;
			}
			year++;
		}
		System.out.println("前4年学费为"+fourYearMoney);
	}

}
