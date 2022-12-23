
//write a program to show method overriding using a Bank class  as super class and create some sub-class,accordingly.
//Write at least one common property(method) and change the implementation in sub-classes .
//Display the implementation of each sub-class with objects?


package thursdaylab;

class Bank{               //Parent class
	public void Intrest() {
		System.out.println("intrest in Bank are:");
	}
}
class SBI extends Bank{              //Sub-class1
	@Override public void Intrest() {
		System.out.println("Intrest in SBI is 5%");
		
	}
	public void display() {
		System.out.println("method of SBI");
	}
}
class Axis extends Bank{        ////Sub-class2
	@Override public void Intrest() {
		System.out.println("Intrest in Axis is 4%");
	}
	public void display() {
		System.out.println("method of Axis");
	}
}
class ICICI extends Bank {             //Sub-class3
	@Override public void Intrest() {
		System.out.println("Intrest in ICICI is 3%");

	}
	public void display() {
	System.out.println("method of ICICI");
	
	   }
	}

public class BankingSystem {          //Main class

	public static void main(String[] args) {
		Bank bank=new Bank();
		Bank sbi=new SBI();
		Bank axis= new Axis();
		Bank icici=new ICICI();
		
		
		bank.Intrest();
		sbi.Intrest();
		axis.Intrest();
		icici.Intrest();
		
		SBI obj1=new SBI();
		Axis obj2=new Axis();
		ICICI obj3=new ICICI();                     //Object creation
		
		obj1.display();
		obj2.display();
		obj3.display();
		
	}

}
