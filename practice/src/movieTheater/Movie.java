package movieTheater;

public class Movie {
	
	String theaterName;
	String quality;
	String movieTitle;
	String location;
	Person[] person;
	int index;
	
	public Movie(String theaterName, String quality, String movieTitle, String location, Person[] person, int index) {
		super();
		this.theaterName = theaterName;
		this.quality = quality;
		this.movieTitle = movieTitle;
		this.location = location;
		this.person = person;
		this.index = index;
	}
	
	public void getReservation(Person person) {
		this.person[this.index++] = person;
		
	}
	
	public void printReservationList() {
		
		for(int i=0;i<this.index;i++) {
			if(this.person[i] != null) {
				System.out.println(this.person[i].top + "에 " + this.person[i].bottom + "를 착용하고, 나이는 " + this.person[i].age + "살에 키는 " 
								+ this.person[i].height + "인 고객은 " + this.theaterName + " " + this.location + "에서 " + this.movieTitle);
			}
		}
	}
}
