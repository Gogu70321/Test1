package project1;

public class StaticDemo {

	
	public static void main(String[] args) {
		
		Example obj1 = new Example();
		Example obj2 = new Example();
		Example obj3 = new Example();
	}
}


class Example {
	
	
	
	static int x=6;
	
	int y = 7;
	
	public Example() {
		
		x++;
		y++;
		
		System.out.println("Value of x:" +x);
		System.out.println("Value of y:" +y);
	}
}