package training;

public class KidUsers implements LibraryUser {
	int age;
	String bookType;
	


	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}



	@Override
	public void registerAccount() {
		
		
		if(age<12) {
			System.out.println("You are registered under kids acount");
			
		}
		else {
			System.out.println("Please register under adult account");
		}
		}
		
	

	@Override
	public void requestBook() {
		if(age<12) {
			if(bookType=="kids") {
			System.out.println("You can borrow book for 10 days");
		}
			else {
				System.out.println("please select booktype- kids");
			}
		}
	}
	}

