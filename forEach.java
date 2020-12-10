//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList();
		l.add("Ram");
		l.add("Vinay");
		l.add("Raj");
		l.add("Ravi");
		l.add("Krishna");
		l.add("Prithvi");
		l.forEach(i -> System.out.println(i));
		System.out.println(".............................................");
		l.forEach(System.out::println);
		
		HashMap<Integer, String> recordBook = new HashMap<Integer, String>();
		recordBook.put(101, "Raj");
		recordBook.put(102, "Shravya");
		recordBook.put(103, "Sai");
		recordBook.put(104, "Ram");
		recordBook.put(105, "Ria");
		recordBook.forEach((k,v)->System.out.println("id = " + k + ", name = " + v));
		//recordBook.forEach(System.out::println);//will give error
	}

}
