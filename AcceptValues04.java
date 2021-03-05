/*
 *Write a program to create an array of 10 integers. 
 *Accept values from the user and print even and odd numbers separately.
 */
package dataS;
import java.util.Scanner;

public class AcceptValues04 {

	public static void main(String[] args) {
		int i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("how many elements you want to enter? ");
		int e=in.nextInt();;

		int a[]=new int[e];
		for(i=0;i<e;i++) {
			a[i]=in.nextInt();
		}
		if(e%2==0) {
			for(j=e/2,i=j-1;i>=0;i--,j++) {
				System.out.println(a[i]+" , "+a[j]);
			}
			
		} else {
			i=j=e/2;
			System.out.println(a[i]+",");
			for(i--,j++;i>=0;i--,j++) {
				System.out.println(a[i]+" , "+a[j]);
			}
		}
	}
}