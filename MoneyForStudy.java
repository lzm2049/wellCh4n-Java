package wellCh4n;

public class MoneyForStudy {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int year=1;
		double fourYearMoney = 0;
		while(year<=10){
			double everyYearMoney=400*Math.pow((1+0.05), year);
			System.out.println("��"+year+"��ѧ��Ϊ"+everyYearMoney);
			if(year>=1&&year<=4){
				fourYearMoney=fourYearMoney+everyYearMoney;
			}
			year++;
		}
		System.out.println("ǰ4��ѧ��Ϊ"+fourYearMoney);
	}

}
