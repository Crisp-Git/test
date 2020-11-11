package com.bean;

import java.util.Scanner;

public class Demo8 {
  public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	double sum=0;
	for(int i=0;i<5;i++){
		System.out.println("请输入第"+(i+1)+"门课成绩");
		double score=input.nextDouble();
		sum+=score;
	}
	System.out.println("平均值:"+(sum/5));
}
}
