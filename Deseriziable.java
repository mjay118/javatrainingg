    import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;

	class Student implements Serializable{
		int id;
		String name;
		int marks;
		public Student(int id, String name, int marks) {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
		}
		
	}
	public class Deseriziable {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			Student s=new Student(1,"Mrityunjay",450);
			FileOutputStream fo = new FileOutputStream("E:\\abcde.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(s);
			oo.close();
			
			FileInputStream fi = new FileInputStream("E:\\abcde.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			s = (Student) oi.readObject();
			System.out.println(s.id+" "+s.name+" "+s.marks);
			oi.close();
		}
	}

