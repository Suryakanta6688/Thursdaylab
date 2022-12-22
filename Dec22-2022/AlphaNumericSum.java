package thursdaylab;

public class AlphaNumericSum {

	public static void main(String[] args) {
		String str="hello123";
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
