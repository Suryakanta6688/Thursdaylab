
//Write a program find out sum of all digits from alpha numeric string   


// here input from user, 
//the given string is"hello123"


package thursdaylab;

public class AlphaNumericSum {

	public static void main(String[] args) {
		String str="hello123";                         //given string from user 
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)>='0'&& str.charAt(i)<='9')
				{
				sum+=(str.charAt(i)-'0');
				}
		}
		
System.out.println("Sum of all number in this String is---->"+sum);
	}

}
