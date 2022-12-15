
//Write a program to check "I" is present or not in "MUMBAI"
package thursdaylab;

public class LetterPresentOrNot {

	public static void main(String[] args) {
String str="MUMBAI";int i;  //MUMBAI is the given Word
boolean ch=false;
for(i=0;i<str.length();i++)
{
	if(str.charAt(i)=='I')   //I is the letter present or not
	{
		ch=true;
		
		break;
		
	}
}
System.out.println(ch);
	}

}
