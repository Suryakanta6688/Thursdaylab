package javabasicprogram;

public class FirstAndLastDigitOfNumber {

	public static void main(String[] args) {
int number=3456;
int firstDigit=0;
int lastDigit=0;
lastDigit= number%10;
System.out.println("lastDigit:"+lastDigit);
while (number!=0)
{
	firstDigit=number%10;
	number/=10;
	
}
	System.out.println("firstDigit"+firstDigit);
	
	}

}
