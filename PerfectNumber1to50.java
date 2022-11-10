package javabasicprogram;

public class PerfectNumber1to50 {

	public static void main(String[] args) {
int i,sum=0,num,num1=1,num2=50;
System.out.println("    Perfect number between 1 to 50    " );
for (num=num1; num<=num2; num++)
{
	sum=0;
	for(i=1; i<num;i++)
	{
		if( num%i==0)
			sum=sum+i;
		
	}
		
	if(num==sum)
		System.out.print(sum+" ");
}
	}

}
