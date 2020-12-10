import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import assignment9.Employee;

public class EmployeeMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdfmt1 = new SimpleDateFormat("dd/MM/yyyy");
		Employee e=new Employee("Ajay",sdfmt1.parse("08/07/2019"),"IT","S.E",25000.0);
		
		FileOutputStream fo = new FileOutputStream("E:\\data.csv");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(e);
		oo.close();
		
		FileInputStream fi = new FileInputStream("E:\\data.csv");
		ObjectInputStream oi = new ObjectInputStream(fi);
		e = (Employee) oi.readObject();
		System.out.println(e.name+" "+e.dateOfBirth+" "+e.department+" "+e.designation+" "+e.salary);
		oi.close();
	}
	
}
