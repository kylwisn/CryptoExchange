import java.io.IOException;
import java.util.Scanner;

//Created by Kyle 2021

public class Exchange {
	
	public static Scanner scan = new Scanner(System.in);
	public static float transactionAmt;
	public static Agent a = new Agent();
	
	public static void main(String[] args) {

		// Input client name
		a.InputCustomerName();
				
		
		// Space for readability
		System.out.println("");
		System.out.println("");

		
		
		//setting up a loop to repeat the menu until you exit
	    boolean mainLoop = true;
	    int choice;
	    while(mainLoop){
	        System.out.println("Main Menu\n");
	        System.out.print("1.) Check balances. \n");
	        System.out.print("2.) Check crypto prices.\n");
	        System.out.print("3.) Buy BTC.\n");
	        System.out.print("4.) Sell BTC.\n");
	        System.out.print("5.) Buy ETH.\n");
	        System.out.print("6.) SELL ETH.\n");
	        System.out.print("7.) BUY LTC. \n");
	        System.out.print("8.) SELL LTC.\n");
	        System.out.print("9.) BUY CEL.\n");
	        System.out.print("10.) SELL CEL.\n");
	        System.out.print("11.) BUY DOGE.\n");
	        System.out.print("12.) SELL DOGE.\n");
	        System.out.print("13.) Exit.\n");
	        System.out.print("\nEnter Your Menu Choice: ");
	        
	        // record selection
	        choice = scan.nextInt();
	        
	        //switch goes here
	        switch(choice) {
	        case 1:
	        	//Check balances
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;
	        case 2:
	        	//Check crypto prices
	        	a.marketPrices();
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 3:
	        	//buy btc
	    		a.AgentBuyBTC();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 4:
	        	//sell btc
	    		a.AgentSellBTC();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 5:
	        	//buy eth
	    		a.AgentBuyETH();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 6:
	        	//sell eth
	    		a.AgentSellETH();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 7:
	        	//buy ltc
	    		a.AgentBuyLTC();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 8:
	        	//sell ltc
	    		a.AgentSellLTC();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 9:
	        	//buy cel
	    		a.AgentBuyCEL();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;
	        case 10:
	        	//sell cel
	    		a.AgentSellCEL();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 11:
	        	//buy doge
	    		a.AgentBuyDOGE();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 12:
	        	//sell doge
	    		a.AgentSellDOGE();
	    		System.out.println("");
	        	currentBalance();      	
	    		System.out.println("");
	    		pushEnter();
	    		clearConsole();
	        	break;	
	        case 13:
	        	//Exit
	            System.out.println("Exiting Program...");
	            mainLoop = false;
	            System.exit(0);
	        	break;
	        case 14:
	        	easterEgg();
	        	pushEnter();
	    		clearConsole();
	        	break;
	        default :
	             System.out.println("This is not a valid Menu Option! Please Select Another");
	             clearConsole();
	             break;
	        }
	        
	        
	       // LOOPING SWITCH
	    }
		
		

		
		// END MAIN
	}


	
	public static void currentBalance() {
		//Balance Sheet
		System.out.println(a.PrintCustomerName() + "'s current balances are: ");
		System.out.println("USD = $" + a.ClientUSDBalance());
		System.out.println("Bitcoin = $" + a.ClientBTCBalance() + " or " + a.ClientBTCBalance()/a.BTCPrice + " BTC");
		System.out.println("Etherium = $" + a.ClientETHBalance() + " or " + a.ClientETHBalance()/a.ETHPrice + " ETH");
		System.out.println("Litecoin = $" + a.ClientLTCBalance() + " or " + a.ClientLTCBalance()/a.LTCPrice + " LTC");
		System.out.println("Celsius = $" + a.ClientCELBalance() + " or " + a.ClientCELBalance()/a.CELPrice + " CEL");
		System.out.println("Doge = $" + a.ClientDOGEBalance() + " or " + a.ClientDOGEBalance()/a.DOGEPrice + " DOGE");

	}
	
	public static void pushEnter() {
		System.out.println("");
		System.out.println("Push the Enter key to continue. . .");
        Scanner input = new Scanner(System.in);
    	String cont = input.nextLine();
        while(cont.equals(" ")) {
            cont = input.nextLine();
        }
        //input.close();
	}
	
	// To clear the screen after inputs
	public static void clearConsole() {
	    try {
	        if (System.getProperty("os.name").contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        }
	        else {
	            System.out.print("\033\143");
	        }
	    } catch (IOException | InterruptedException ex) {}
	}
	
	
    public static void easterEgg() {    
        System.out.println("                        .--");
        System.out.println("                   `:/+/`                           `...`");
        System.out.println("                   .::+o/`                         ./++++-");
        System.out.println("                   -:/+oo/.                      .:/++osso`");
        System.out.println("                  `-:/+oo+/.                   .:/++++ooss-");
        System.out.println("                  `://++oo++:.```            .:/o+++ooosss/");
        System.out.println("                  `:/+///////////::::::----.:/+ooooossssoo+");
        System.out.println("                  -:/:::://///////////////o++ossoosyhhysooo`");
        System.out.println("                `.::::::://++++///////////+osysoooshddyooo+");                 	
        System.out.println("           ``..--:::---::/+++++/////////////+ssooshddhsooo-");                 	
        System.out.println("         `.----::::----://+++/////////////////ooshddhso+o+`");                 
        System.out.println("        `------:::::::::/++++//:::://+++////////oshsoooss+.");                 
        System.out.println("       `------:osyo+:::/++++/:::::://++++/////////++ooooo+:-");                 
        System.out.println("       .--...-+symhy/////////:::/://///+++//////:::/++osso/:.");                 
        System.out.println("       -..`..-+yhddo/::::::////+syydys+++////////:/://+sys+/:`");                 
        System.out.println("      `..`..-:/os+/::::::::/+oydoohmmmho+//////////////+so+/:`");                 
        System.out.println("      `.....:::::::::--::::/osddohmNmhs//::::::::://////+++/:`");                 
        System.out.println("      `.....----:::::--::::/+/+osssso/::::---::::::::////+///`");                 
        System.out.println("     `.....:/+ooo++/::--:::://:///////:::----:::::::::://///:");                 
        System.out.println("     .....+ddmmmdddy+-----::::::::::::::-----------:::::////:");                 
        System.out.println("    `.--..ommmmNNNNds:-----::::------:::-----------:::::////:");                 
        System.out.println("    ..-..:odmmmmNNmho/:::::::::-------------:::::::::://++//:");                 
        System.out.println("   `-.--:/ohdmmmmdyo+//:::::::---::::----:::::::::://///++//-");                 
        System.out.println("   `...-:+syhddddhyo+////////::::::::::::::::::/::::://++++/`");                 
        System.out.println("   `-..--:ohdmmmdhhso+///////+//::::::/:::::::::::::///+++/:");                 
        System.out.println("    -.----/yhdmmmmmdyo++oossys+///:///::::::::::::::://++++:");                 
        System.out.println("    ....--:/+yhhhhhhhdhyhhyyo+//////:::::::::::::::///+++++:");                 
        System.out.println("     .-.---::/ooooo+oooooo++//::////:::::::::::::////++++++.");                 
        System.out.println("     `.---:::::///////////////////////:::::::::////+++++++-");                 
        System.out.println("      .----:::::::::///////////////::::::::::://///+++++/`");                 
        System.out.println("      `-:-::-:::::::://///////////:::::::::////////+++o/");                 
        System.out.println("        `-:::::::::://///////////:::::::::/::///////++:`");                 
        System.out.println("          .:::::::::://////////////////////::/:////+/-");                 
        System.out.println("           ``.-:::::///////////////+/////::///////:-`");                 
        System.out.println("                `..--::/++++++++++/////::::::--..`");                 
        System.out.println("                       `..-----------...`");

   } 

		
	
	//End Exchange Class
}
