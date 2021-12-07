package com.company;

public class Father extends GrandFather{

	public Father(int age, String name, String job, Hobby lookTv) {
		super(age, name, job, lookTv);
	}

	public void car(int num){
		System.out.println(num);
	}
	public void car(String model){
		System.out.println(model);
	}

}
