
//Write a program of reverse of a String



package thursdaylab;

public class ReverseOfString {

	public static void main(String[] args) {
    String str="Anudip Foundation";  //Anudip Foundation Is a Given String

System.out.println("The Original String is:" +str);
    StringBuilder reverseString = new StringBuilder(str);
     reverseString.reverse();

     String result = reverseString.toString();
System.out.println("The Reverse String is:" +result);
  }

}
