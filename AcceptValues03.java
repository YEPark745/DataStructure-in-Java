/*
 * Write a program to create an array of 10 integers. 
 * Accept values from the user and print them from the middle towards two ends.
 */
package dataS;
import java.util.Scanner;

public class AcceptValues03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=in.nextInt();
		}
		for(int i=4,j=i+1;i>=0;i--,j++) {
			System.out.println(a[i]+","+a[j]);
		}
	}
}