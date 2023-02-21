package Jaimin;
import java.util.Scanner;
import java.io.*;
public class Pra5 {

	public static void main(String args[]) {
		String str = new String();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		str = scan.next();
		int len = str.length();
		System.out.println("Substrating of given string "+str.substring(len/2));
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String str1 = sb.toString();
		if(str.equalsIgnoreCase(str1)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}
}
