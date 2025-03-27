package org.tnsif.capgemini.c2tc.scannerclass_bufferreader;

import java.util.Scanner;
public class AdvancedScannerClass {

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter some data(you can enter number or text");
		while(scan1.hasNext())
		if(scan1.hasNextInt())
			{
				int intvalue=scan1.nextInt();
				System.out.println("read an integer "+ intvalue);
			}
		else if (scan1.hasNextDouble())
		{
			double doublevalue=scan1.nextDouble();
			System.out.println("read an double "+doublevalue);
		}
		else
		{
			String stringvalue=scan1.next();
			System.out.println("unknow input " +stringvalue);
		}

	}

}