package movieTheater;

public class MainTheater {

	public static void main(String[] args) {
		
		Person luon = new Person("흰 티", "검은 바지", 8, 130);
		Person leon = new Person("갈색 셔츠", "청바지", 13, 160);
		Person laon = new Person("노란 스웨터", "흰색 치마", 20, 165);
		Person lion = new Person("보라색 체크셔츠", "반바지", 19, 167);
		Person aron = new Person("검은색 반팔티", "긴청바지", 27, 180);
		
		Movie[] lotteMovie = new Movie[3];
		Movie[] megaMovie = new Movie[2];
		Movie[] cgvMovie = new Movie[1];
		
		LotteCinema lotteCinema = new LotteCinema(lotteMovie, 0);
		MEGABOX megabox = new MEGABOX(megaMovie, 0);
		CGV cgv = new CGV(cgvMovie, 0);
		
		Person[] lottePeops = new Person[30];
		Movie lottePororo = new Movie("롯데시네마", "2D", "뽀로로", "7관", lottePeops, 0);
		
		lotteCinema.getMovie(lottePororo);
		
		Person[] megaPeops = new Person[42];
		Movie megaTopgun = new Movie("메가박스", "3D", "탑건", "4관", megaPeops, 0);
		
		megabox.getMovie(megaTopgun);
		
		Person[] cgvPeops = new Person[120];
		Movie cgvInterstella = new Movie("CGV", "3D", "인터스텔라", "12관", cgvPeops, 0);
		
		cgv.getMovie(cgvInterstella);
		
		lottePororo.getReservation(luon);
		megaTopgun.getReservation(leon);
		megaTopgun.getReservation(laon);
		megaTopgun.getReservation(lion);
		cgvInterstella.getReservation(aron);
		
		lottePororo.printReservationList();
		megaTopgun.printReservationList();
		cgvInterstella.printReservationList();
	}
}
