package wellCh4n;

public class Book {
	int no;
	String title;
	int pageNum;
	String type;
	Book(){
		no=123;
		title="���ݿ����";
		pageNum=99;
		type="�������鼮";
	}
	Book(int no,String title,int pageNum,String type){
		this.no=no;
		this.title=title;
		this.pageNum=pageNum;
		this.type=type;
	}
	public void showM(){
		System.out.println("��ţ�"+no+"\t���⣺"+title+"\tҳ����"+pageNum+"\t���ͣ�"+type);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Book b =new Book();
		b.showM();
		Book b1=new Book(456,"java���򿪷�",100,"�������鼮");
		b1.showM();
		
	}

}
