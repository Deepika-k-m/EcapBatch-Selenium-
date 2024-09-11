package Seleniumpackage;

import java.util.Scanner;

public class Arrays_In_Java 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ARRAYS IN JAVA");
	
		System.out.println("-----------ONE DIMENTIONAL ARRAY IN JAVA---------------------");
		
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter a number");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);

	}
		
		
		
		
		System.out.println("-----------TWO DIMENTIONAL ARRAY IN JAVA---------------------");
		int arr1[][]=new int[3][3];
				Scanner scan=new Scanner(System.in);  
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.println("Enter the element for");
				arr1[i][j]=scan.nextInt();
			}
				}
			for(int i=0;i<arr1.length;i++) 
			{
				for(int j=0;j<arr1[i].length;j++) {
			
				System.out.println(arr1[i][j]);
				}
			
		}
		
			System.out.println("--------------------------JAGGED ARRAY IN JAVA---------------------------------------");
			Scanner jag=new Scanner(System.in);
			int arrjag[][]=new int[3][];
			arrjag[0]=new int[2];
			arrjag[1]=new int[5];
			arrjag[2]=new int[6];
			for(int i=0;i<arrjag.length;i++) {
				for(int j=0;j<arrjag[i].length;j++) {
					System.out.println("enther the number for"+i+"th row and for"+j+"th column");
					arrjag[i][j]=jag.nextInt();				
					}
			}
			
			
			
		
	}
}


