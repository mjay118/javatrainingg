class Students{
int sid;
String sname;
int marks;
String section;
int rank;
float percentage;
String class;
long mobile;
String address;
String classTeacher;
Students(int sid,String sname,String class,String section,String classTeacher,int marks,float percentage,int rank,String address,long mobile){
this.sid=sid;
this.sname=sname;
this.class=class;
this.section=section;
this.classTeacher=classTeacher;
this.marks=marks;
this.percentage=percentage;
this.rank=rank;
this.address=address;
this.mobile=mobile;
this.display();
}
void display(){
System.out.println("Student id="+sid);
System.out.println("Student name="+sname);
System.out.println("Student class="+class);
System.out.println("Student section="+section);
System.out.println("Student class teacher="+classTeacher);
System.out.println("Student marks="+marks);
System.out.println("Student percentage="+percentage);
System.out.println("Student rank="+rank);
System.out.println("Student address="+address);
System.out.println("Student mobile="+mobile);
}
}
class StudentsConstructor{
public static void main(String args[]){
Students raj=new Students(1,"Raj","M2","Rohit",500,80.0f,22,"Hyd",9876543210L);

}
}