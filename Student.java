package wellCh4n;

public class Student {
	private int stuno;
	private int $class;
	private String name;
	private String sex;
	private int age;
	Student(int stuno,int $class,String name,String sex,int age) {
		this.stuno=stuno;
		this.$class=$class;
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	
	public void showM(){
		System.out.println("学号："+stuno+"\t班级："+$class+"\t姓名："+name+"\t性别："+sex+"\t年龄"+age);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student s =new Student(479,1501,"陈伟豪","男",20);
		s.showM();
	}

}
