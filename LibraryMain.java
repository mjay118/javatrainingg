package training;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LibraryUser l=new KidUsers(6, "fiction");
l.registerAccount();
l.requestBook();
LibraryUser l1=new KidUsers(6, "kids");
l1.registerAccount();
l1.requestBook();
LibraryUser l3=new AdultUser(16, "fiction");
l3.registerAccount();
l3.requestBook();
LibraryUser l4=new AdultUser(16, "kids");
l4.registerAccount();
l4.requestBook();
	}

}
