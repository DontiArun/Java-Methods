package medoths;

public class MethodExample2 {
	//a method with nothing
	void getData() {
		System.out.println("nothing is here");
		return;
	}
	//a method with parameters or arguments
	void getData(int a,int b) {
		System.out.println("sum is "+(a+b));
		return;
	}
	//method with single argument
	void getData(int a) {
		System.out.println("A value is"+a);
	}

}

class example{
	public static void main(String args[]) {
		//creating object to call method
		MethodExample2 obj=new MethodExample2();
		
		obj.getData();
		obj.getData(2);
		obj.getData(2,3);
		
	}
}