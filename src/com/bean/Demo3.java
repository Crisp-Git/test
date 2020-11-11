package com.bean;

import java.util.Scanner;

public class Demo3 {
  public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	 String i="n";  
	while(i.equals("n")){
	   System.out.println("上午阅读教材，学习理论部分，\n下午上机编程");
	   System.out.println("请老师判断是否合格y,n");
	   i=input.next();
	}
	System.out.println("合格");
}
}
