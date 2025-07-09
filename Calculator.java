package methods;

public class Calculator {
	
	public int sum(int val1, int val2) {
		
		int total = val1+val2;
		//doing some logging stuff
		//System.out.println("addtion of val1 & val2 is :"+total);
		return total;
	}


public int getPriceofPen() {
	int CapPrice = 2;
	int PenBodyPrice = 5;
	int TotalPenPrice = sum(CapPrice,PenBodyPrice);
	//System.out.println("pen price : "+TotalPenPrice);
	return TotalPenPrice;
}


	public static void main(String args[]){
	
		Calculator value=new Calculator();
		
		System.out.println(value.sum(2,4));
		System.out.println(value.getPriceofPen());	
		}
}
