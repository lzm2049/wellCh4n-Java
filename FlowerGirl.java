package wellCh4n;

public class FlowerGirl {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=1;i<=8;i++){
			if((112-20*i)%12==0 && i+((112-20*i)/12)==8){
				System.out.println("天晴了"+i+"天,"+"下雨了"+(112-20*i)/12+"天");
			}
		}
	}
}
