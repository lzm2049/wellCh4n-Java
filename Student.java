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
		System.out.println("ѧ�ţ�"+stuno+"\t�༶��"+$class+"\t������"+name+"\t�Ա�"+sex+"\t����"+age);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Student s =new Student(479,1501,"��ΰ��","��",20);
		s.showM();
	}

}
