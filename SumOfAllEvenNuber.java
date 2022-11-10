package javabasicprogram;

import java.util.Scanner;

public class SumOfAllEvenNuber {
public static void main(String[] args) 
{
	int i,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter range");
	n=sc.nextInt();
	for(i=2;i<=n;i+=2)
	{
		sum+=i;
		
	}
	System.out.println("sum of all even number from 1 to"+n+" is:" +sum);
}

}
