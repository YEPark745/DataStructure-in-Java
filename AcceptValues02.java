/*
 * Write a program to create an array of 10 integers. 
 * Accept values from the user and print them
 */
package dataS;
import java.util.Scanner;

public class AcceptValues02 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=in.nextInt();
			
		}
//		for(int i=4,j=i+1;i>=0;i--,j++) {
//			System.out.println(a[i]+","+a[j]);
//		}
		for(int i=10;i>0;i--) {
			System.out.print(a[i-1]+",");
			}
		}

	}