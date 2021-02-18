
public class Agent extends Client {
	// Agent extends Client
	// Agent inherits client
	
	
	//PUT THE CRYPTO PRICES UP HERE so that the functions below can use the prices and buying and selling
	//set an initial how much you have and then you can use increment up/down to show how much you have and then multiply it based on the price to show how much you have. 
	
	public float BTCPrice = 46255.40f;
	public float ETHPrice = 1792.94f;
	public float LTCPrice = 187.86f;
	public float CELPrice = 6.00f;
	public float DOGEPrice = 0.072705f;
	
	

	// AGENT BUY AND SELL BTC
	void AgentBuyBTC() {
		System.out.print("How much in BTC do you want to buy: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance - howMuch;
		ClientBTCBalance = ClientBTCBalance + howMuch;
	}
	
	void AgentSellBTC() {
		System.out.print("How much in BTC do you want to sell: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance + howMuch;
		ClientBTCBalance = ClientBTCBalance - howMuch;
	}
	
		
	// AGENT BUY AND SELL ETH
	void AgentBuyETH() {
		System.out.print("How much in ETH do you want to buy: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance - howMuch;
		ClientETHBalance = ClientETHBalance + howMuch;
	}
	
	void AgentSellETH() {
		System.out.print("How much in ETH do you want to sell: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance + howMuch;
		ClientETHBalance = ClientETHBalance - howMuch;
	}
	
	
	// AGENT BUY AND SELL LTC
	void AgentBuyLTC() {
		System.out.print("How much in LTC do you want to buy: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance - howMuch;
		ClientLTCBalance = ClientLTCBalance + howMuch;
	}
	
	void AgentSellLTC() {
		System.out.print("How much in LTC do you want to sell: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance + howMuch;
		ClientLTCBalance = ClientLTCBalance - howMuch;
	}
	
	
	// AGENT BUY AND SELL CEL
	void AgentBuyCEL() {
		System.out.print("How much in CEL do you want to buy: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance - howMuch;
		ClientBTCBalance = ClientBTCBalance + howMuch;
	}
	
	void AgentSellCEL() {
		System.out.print("How much in CEL do you want to sell: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance + howMuch;
		ClientBTCBalance = ClientBTCBalance - howMuch;
	}
	
	
	// AGENT BUY AND SELL DOGE
	void AgentBuyDOGE() {
		System.out.print("How much in DOGE do you want to buy: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance - howMuch;
		ClientDOGEBalance = ClientDOGEBalance + howMuch;
	}
	
	void AgentSellDOGE() {
		System.out.print("How much in DOGE do you want to sell: ");
		float howMuch = scan.nextFloat();
		ClientUSDBalance = ClientUSDBalance + howMuch;
		ClientDOGEBalance = ClientDOGEBalance - howMuch;
	}
	

	/* Agent Crypto Price Lookup*/
	public void marketPrices() {
		System.out.println("Current crypto prices: ");
		System.out.println("Bitcoin = $" + BTCPrice);
		System.out.println("Etherium = $" + ETHPrice);
		System.out.println("Litecoin = $" + LTCPrice);
		System.out.println("Celsius = $" + CELPrice);
		System.out.println("Doge = $" + DOGEPrice);
	}


		
	
	// END AGENT CLASS
}
