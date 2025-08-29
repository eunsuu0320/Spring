package com.example.demo;

import org.springframework.stereotype.Component;

// 자식
//@Component // 싱글톤 패턴으로 객체를 생성해서 컨테이너에 담는다
public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("야옹@!");
	}

}
