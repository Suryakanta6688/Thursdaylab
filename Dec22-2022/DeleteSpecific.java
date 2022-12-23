
//Write a program to remove a specific elements from an array.......?

//here we take input from user


package thursdaylab;

import java.util.Scanner;

public class DeleteSpecific {

	public static void main(String[] args) {
        int i,j,size=5,delement;
        boolean f=false;                                    //size=5 because input from user
        int[] arr=new int[size];
   Scanner sc =new Scanner(System.in);

   System.out.println("Enter 5 Elements:");
         for(i=0;i<size;i++)     //initialization of array
	     arr[i]=sc.nextInt();
   System.out.println("Enter the number to delete");
          delement=sc.nextInt();
for(i=0;i<size;i++)
{
	if(delement==arr[i])
	{
		for(j=i; j<(size-1); j++)         //for delete element
			arr[j]=arr[j+1];
		System.out.println("element deleted successfully ");
   f=true;
		break;
		
	}
	
}
if (f==false)
	System.out.println("Element not found");                    //for element which not present in this array
else
{
    System.out.println("The new array is here:");
          for(i=0;i<size-1;i++)             //for final new array after delete
        	  
	System.out.println(arr[i]+" ");
	}
}
}
