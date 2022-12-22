package thursdaylab;

public class MobileServiceProvider {

		float getUnlimitedPack(){
			return 0;
			}  
		}  
		class Jio extends MobileServiceProvider{  
			float getUnlimitedPack(){
				return 399;
				}		
			}  
		class Airtel extends MobileServiceProvider{  
		float getUnlimitedPack(){
			return 199;
			}
		}  
		class VI extends MobileServiceProvider {  
			float getUnlimitedPack(){
				return 299;
				}		}  
		class TestPolymorphism{  
		public static void main(String[] args){  
			MobileServiceProvider mob;  
		mob=new Jio();  
		System.out.println("Jio mob. unlimitedPack "+mob.getUnlimitedPack()); 
		
		mob=new Airtel();  
		System.out.println("Airtel mob. unlimitedPack "+mob.getUnlimitedPack());  
		
		mob=new VI();  
		System.out.println("VI mob. unlimitedPack "+mob.getUnlimitedPack()); 
		 
		}  
		
		}
		
		
		
		