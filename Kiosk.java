import java.util.ArrayList;
import java.util.List;

public class Kiosk {
	private Catalogue catalogue; 
	private List<Customer> customers;
	
    public static void main(String[] args{

        Kiosk kiosk = new Kiosk();
        kiosk.use();

    }

    public Kiosk(){
        use();
    }

    private void use(){

        char choice = mainMenu();

        switch(choice){
            case '1': catalogueScreen(); break;
            case '2': customerScreen(); break;
            case '3': favouriteGame(); break;
            case '4': topUp(); break;
            case '5': adminUse(); break;
            case 'X': break;
        }

    }

    private char mainMenu(){
        System.out.println("Welcome to the Game Kiosk! Please make a selection from the menu:");

        System.out.println("1.  Explore the catalogue.");
        System.out.println("2.  View your customer record");
        System.out.println("3.  Show you favourite games.")
        System.out.println("4.  Top up account.")
        System.out.println("5.  Enter Admin mode.")
        System.out.println("X.  Exit the system.")
        System.out.print("Enter a choice: ");
        char choice = In.nextChar();

        return choice;
    }

    private void adminUse(){

        char choice = In.nextChar();

        switch(choice){
            case '1': customers.listCustomers(); break;
            case '2': customers.addCustomer(); break;
            case '3': customers.removeCustomer(); break;
            case '4': catalogue.listGames(); break;
            case '5': catalogue.addGame(); break;
            case '6': catalogue.removeGame(); break;
            case 'R': use(); break;
        }

    }

    private char adminMenu(){

        System.out.println("Welcome to the administration menu:");
        System.out.println("1.  List all customers.");
        System.out.println("2.  Add a customer.");
        System.out.println("3.  Remove a customer.");
        System.out.println("4.  List all games.");
        System.out.println("5.  Add a game to the catalogue.");
        System.out.println("6.  Remove a game from the catalogue.");
        System.out.println("R.  Return to the previous menu.");
        System.out.print("Enter a choice: ");
        char choice = In.nextChar();

        return choice;
    }

    private void catalogueScreen(){}

    private void customerScreen(){}

    private void favouriteGame(){}

    private void topUp(){}

    private void listCustomers(){}

    private void addCustomer(){}

    private void removeCustomer(){}

    private void listGames(){}

    private void addGame(){}
    
    private void removeGame(){}

		

}


