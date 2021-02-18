import java.util.Scanner;


public class Client {

	//set up scanner
	public static Scanner scan = new Scanner(System.in);
	
	//Defining the currency balances
	float ClientUSDBalance = 100000.00f; //USD
	float ClientBTCBalance = 0.00f; //Bitcoin
	float ClientETHBalance = 0.00f; //Etherium
	float ClientLTCBalance = 0.00f; //Litecoin
	float ClientCELBalance = 0.00f; //Celsius
	float ClientDOGEBalance = 0.00f; //Doge
	
	// client name
	public String CustomerName;
	
	
	public Client() {

	}
	
	//Function to input client name	
	public void InputCustomerName() {
		System.out.print("Enter the client's name: ");
		CustomerName = scan.nextLine();
	}
	
	//Function to display client name if called
	public String PrintCustomerName() {
		return CustomerName;
	}
	
	
	// USD Balance
	public float ClientUSDBalance() { // return current USD balance
		return ClientUSDBalance;		
	}
	
	// BTC Balance
	public float ClientBTCBalance() { // return current BTC balance
		return ClientBTCBalance;		
	}
	
	// ETH Balance
	public float ClientETHBalance() { // return current ETH balance
		return ClientETHBalance;		
	}
	
	// LTC Balance
	public float ClientLTCBalance() { // return current LTC balance
		return ClientLTCBalance;		
	}
	
	// CEL Balance
	public float ClientCELBalance() { // return current CEL balance
		return ClientCELBalance;		
	}
	
	// DOGE Balance
	public float ClientDOGEBalance() { // return current DOGE balance
		return ClientDOGEBalance;		
	}
		
	
	//END CLIENT CLASS
}
