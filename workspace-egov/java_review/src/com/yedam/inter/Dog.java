package com.yedam.inter;

// 자식
public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
