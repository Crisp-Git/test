package com.bean;

import java.util.Scanner;

public class Demo9 {
  public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  System.out.println("������һ������");
	  int a=input.nextInt();
	  for(int i=0;i<=a;i++){
		System.out.println(i+"+"+(a-i)+"="+a);  
		  
	  }
}
}
