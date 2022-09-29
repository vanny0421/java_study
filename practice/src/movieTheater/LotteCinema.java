package movieTheater;

public class LotteCinema implements Theater {

	Movie[] movie;
	int movie_index;
	
	public LotteCinema(Movie[] movie, int movie_index) {
		super();
		this.movie = movie;
		this.movie_index = movie_index;
	}

	public void getMovie(Movie movie) {
		this.movie[this.movie_index++] = movie;
	}
}
