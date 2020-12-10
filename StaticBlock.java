class Block{
	static {
		System.out.println("Static Block");
	}
}
public class StaticBlock {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("Block");
		System.out.println("ForName Main Method");
	}
}
