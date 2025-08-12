package methods;

class VarArgExp3 {
	
	 public int sum(int a,int ...variable) { //it should be the last argument in list
		 
		 int output = 0;
		 for(int var : variable) {
			 output = output + var;
			
		 }
		 return output;
	 }
	
}

public class VariableArgumentExample3 {

	public static void main(String[] args) {
   
		VarArgExp3 obj = new VarArgExp3();
		
		// Example calls with different number of arguments
		
        int result1 = obj.sum(10);   // int a = 0, argument
        int result2 = obj.sum(10,20);   // a = 10,  One argument
        int result3 = obj.sum(10, 20, 30);   //a = 10, Multiple arguments

        System.out.println("Sum with no arguments: " + result1);       // Output: 10
        System.out.println("Sum with one argument: " + result2);       // Output: 20
        System.out.println("Sum with multiple arguments: " + result3); // Output: 50
	}

}
