package com.bean;

import java.util.Scanner;

public class Demo8 {
  public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	double sum=0;
	for(int i=0;i<5;i++){
		System.out.println("�������"+(i+1)+"�ſγɼ�");
		double score=input.nextDouble();
		sum+=score;
	}
	System.out.println("ƽ��ֵ:"+(sum/5));
}
}
