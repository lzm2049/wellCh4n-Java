package wellCh4n;

public class FlowerGirl {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=1;i<=8;i++){
			if((112-20*i)%12==0 && i+((112-20*i)/12)==8){
				System.out.println("������"+i+"��,"+"������"+(112-20*i)/12+"��");
			}
		}
	}
}
