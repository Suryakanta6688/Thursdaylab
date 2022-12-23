

//Explain run-time polymorphism with a real time scenario....?

package thursdaylab;

class MobileService{                                       //MobileService is the parent class
	int unlimitedPack() {
		return 0;
	}
}
class Jio extends MobileService{                             //Jio is sub-class-1
	int unlimitedPack() {
		return 299;
	}
}
class Airtel extends MobileService{                          //Airtel is sub-class2
	int unlimitedPack() {
		return 399;
	}
}
class VI extends MobileService{                              //VI is sub-class3
	int unlimitedPack() {
		return 499;
	}
}
public class PolymorphismExample2 {                              //PolymorphismExample2 is the main class

	public static void main(String[] args) {
MobileService mob;
mob=new Jio();
System.out.println("The Unlimited pack of Jio is:"+mob.unlimitedPack());
mob=new Airtel();
System.out.println("The Unlimited pack of Airtel is:"+mob.unlimitedPack());
mob=new VI();
System.out.println("The Unlimited pack of VI is:"+mob.unlimitedPack());

	}

}
