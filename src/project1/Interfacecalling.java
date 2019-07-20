package project1;

public class Interfacecalling implements InterfaceExample{

	public static void main(String[] args) {

		Interfacecalling obj = new Interfacecalling();
		obj.withdraw(5500);
		
	}

int balance = 20000;
	@Override
	public void withdraw(int a) {
		
		balance = balance-a;
		
		System.out.println("Remainig Balance: " +balance);
	}

	@Override
	public void deposit(int b) {
		
		
	}

}
