package abb;

import java.util.Scanner;

public class datatypesofvarioustype {

	 public static void main(String[] args) {
			
		    Scanner s=new Scanner(System.in);
				System.out.println("enter the number");
				int n;
				int j=s.nextInt();
				for(int i1=0;i1<=j;i1++)
				{
					System.out.println("the number is =" +i1);
				}
		    
				f2();
			}	
		  public static void f2(){
		   Scanner b=new Scanner(System.in);
		 System.out.println("enter the name");
		   String name=b.nextLine();
		   System.out.println("enter the age");
		   int a=b.nextInt();
		   System.out.println("enter the male or female ");
		   char ch=b.next().charAt(0);
		    System.out.println("enter the phone number");
		   Long d=b.nextLong(10);
		   System.out.println(name);
		   System.out.println(ch);
		   System.out.println(a);
		     System.out.println(d);

		  }
		}
