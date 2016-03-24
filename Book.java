package wellCh4n;

public class Book {
	int no;
	String title;
	int pageNum;
	String type;
	Book(){
		no=123;
		title="数据库基础";
		pageNum=99;
		type="程序类书籍";
	}
	Book(int no,String title,int pageNum,String type){
		this.no=no;
		this.title=title;
		this.pageNum=pageNum;
		this.type=type;
	}
	public void showM(){
		System.out.println("编号："+no+"\t标题："+title+"\t页数："+pageNum+"\t类型："+type);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Book b =new Book();
		b.showM();
		Book b1=new Book(456,"java程序开发",100,"程序类书籍");
		b1.showM();
		
	}

}
