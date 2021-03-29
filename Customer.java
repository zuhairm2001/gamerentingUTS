import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int ID; 
	private String name; 
	private int balance;
	private List<Game> currentlyRented; 
	private List<Game> rentingHistory;


    public Customer(int ID, String name, int balance){
        ID = this.ID;
        name = this.name;
        balance = this.balance;
        currentlyRented = this.currentlyRented;
        rentingHistory = this.rentingHistory;
    }


    public void addCustomer(int ID, String name, int balance){}

    public void removeCustomer(){}

    public void listCustomers(){}
		// write your solution here
}