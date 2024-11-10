package com.tap.project;
import java.util.Scanner;

public class DecodeString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		System.out.print(decodeString(s));
		scan.close();
	}
	public static String decodeString(String s) {
		String t="";
		int i=0;
		while(i<s.length()) {
			int count=0;
			while(i<s.length() && s.charAt(i)=='1') {
				count++;
				i++;
			}
			if(i<s.length() && s.charAt(i)=='0') {
					i++;
			}
			if(count>=1 && count<=26) {
				char ch=(char)(65+count-1);
				t=t+ch;
			}
		}
		return t;
	}
}
