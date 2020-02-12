package abb;

import java.util.Scanner;

public class neven_number {

	
public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);	
System.out.println("enter the number ");
int n=s.nextInt();
for(int i=0;i<=n;i++)
{
	if(i%2==0)
	{
		System.out.println("the even numbers  are "+i);
	}
}
}

}