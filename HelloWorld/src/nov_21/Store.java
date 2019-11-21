package nov_21;


public class Store {
	public static void main(String[] args) {
		
		double priceSnickers = .98;
		int snickersSold = 7;
		double snickersProfit = 0;
		
		double priceGel = 4.2;
		int gelSold = 12;
		
		for (int i = 0; i < snickersSold; i++) {
			snickersProfit += priceSnickers;
			System.out.printf("Profit from Snickers: $%.2f\n", snickersProfit);
		}
	}
}