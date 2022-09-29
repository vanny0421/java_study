package movieTheater;

public class CGV implements Theater {

	Movie[] movie;
	int movie_index;
	
	public CGV(Movie[] movie, int movie_index) {
		super();
		this.movie = movie;
		this.movie_index = movie_index;
	}
	
	public void getMovie(Movie movie) {
		this.movie[movie_index++] = movie;
	}
}
