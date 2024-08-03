public class Q10{
	static public void main(String []args){
		
		double tSellPrice = 15600.0; 
		double profitP = 20.0; 
		int totalItems = 15;
		double totalCostPrice = tSellPrice / (1 + profitP/ 100.0);
		double costPrice = totalCostPrice / totalItems;
		System.out.println("The cost price of one item is: " + costPrice);
	}
}