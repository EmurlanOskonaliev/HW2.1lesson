package com.company;

public class Main {

	public static void main(String[] args) {
		// write your code here
		Father father = new Father(32, "Manas", "IT специалист", Hobby.HOKKEY);
		System.out.println(father.getAge() + " " + father.getJob() + " " + father.getName());
		father.car(388);

		Son Son = new Son(13, "Asan", "Studying at geek tech", Hobby.PLAY_FOOTBALL);
		System.out.println(Son.getAge() + " " + Son.getJob() + " " + Son.getName());
		Son.car(999);

		Son Son2 = new Son(13, "Uson", "Studying at school", Hobby.LOOK_DORAMY);
		System.out.println(Son2.getAge() + " " + Son2.getJob() + " " + Son2.getName());
		Son2.car("BMW");


	}
}
