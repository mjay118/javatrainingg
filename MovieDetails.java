class Movie{
	float Imdb_Rating;
	String movie;
	String actor;
	static String production_house;
	String actress;
	String director;
	String  cinematographer;
	String script_writer;
	String budget;
	String boxOffice_collection;
}
public class MovieDetails {

public static void main(String[] args) {
		
Movie m1 = new Movie();
m1.movie = "WAR";
m1.actor= "HRITHIK ROSHAN, TIGER SHEROFF";
m1.actress= "VANI KAPOOR";
m1.director= "SIDDHARTH ANAND";
m1.script_writer = "ADITYA CHOPRA";
Movie.production_house= "YRF(Yash Raj Films)";
m1.cinematographer= "BENJAMIN JASPER";
m1.Imdb_Rating= 6.5f;
m1.budget= "170 Crores";
m1.boxOffice_collection= "475 Crores";

System.out.println("=============BookDetails=============");
System.out.println("Movie Name : " + m1.movie);
System.out.println("Actor Name : " + m1.actor);
System.out.println("Actress Name : " + m1.actress);
System.out.println("Director Name : " + m1.director);
System.out.println("Script Writer : " + m1.script_writer);
System.out.println("Production House: " + m1.production_house);
System.out.println("Cinematographer : " + m1.cinematographer);
System.out.println("IMDB Rating : " + m1.Imdb_Rating);
System.out.println("Movie Budget : " + m1.budget);
System.out.println("Box Office Collection : " + m1.boxOffice_collection);



	}

}