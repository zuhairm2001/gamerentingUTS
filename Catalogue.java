import java.util.ArrayList;
import java.util.List;

public class Catalogue {
	private Kiosk kiosk;
	private List<Game> gamesAvailable;
	private List<Game> gamesRented; 
	private List<Genre> genres;


    public Catalogue(Kiosk kiosk){
        kiosk = this.kiosk;
        gamesAvailable = this.gamesAvailable;
        gamesRented = this.gamesRented;
        genres = this.genres;

    }





    public void addGame(String title, int year, String genre, int price){}

    public void removeGame(){}

    public void listGames(){}


    		// write your solution here
}