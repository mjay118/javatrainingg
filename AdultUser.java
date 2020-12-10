package training;

public class AdultUser implements LibraryUser {
int age;
String bookType;
public AdultUser(int age, String bookType) {
	super();
	this.age = age;
	this.bookType = bookType;
}
@Override
public void registerAccount() {
	if(age>12) {
		System.out.println("You are registered under adult acount");
		
	}
	else {
		System.out.println("Please register under kids account");
	}
}
@Override
public void requestBook() {
	
if(age>12) {
	if(bookType=="fiction") {
	System.out.println("You can borrow book for 10 days");
}
	else {
		System.out.println("please select booktype- fiction");
	}
}
}}