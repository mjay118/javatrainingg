class Oracle{
	static {
		System.out.println("oracle static block");
	}

Oracle(){
		System.out.println("oracle static block");
	}
}

public class Test {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Class c = Class.forName(args[0]);
	System.out.println(c.getName());
	c.newInstance();
}
}
