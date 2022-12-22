package thursdaylab;

import java.util.Scanner;

public class DeleteSpecific {

	public static void main(String[] args) {
        int i,j,size=5,delement;
        int[] arr=new int[size];
   Scanner sc =new Scanner(System.in);

   System.out.println("Enter 5 Elements:");
         for(i=0;i<size;i++)
	     arr[i]=sc.nextInt();
   System.out.println("Enter the number to delete");
          delement=sc.nextInt();
for(i=0;i<size;i++)
{
	if(delement==arr[i])
	{
		for(j=i; j<(size-1); j++)
			arr[j]=arr[j+1];
		System.out.println("element deleted successfully ");
		break;
		
	}
}

    System.out.println("The new array is here:");
          for(i=0;i<size-1;i++)
        	  
	System.out.println(arr[i]+" ");
	}
}
