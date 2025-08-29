package com.yedam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	
	@Test
	public void test3() {
		Car car1 = new Car("쏘렌토");
		car1.setModel("테슬라"); // write
		System.out.println(car1.getModel()); // read
	}
	
	@DisplayName("객체생성")
	@Test
	public void test2() {
		Car car1 = new Car("쏘렌토");
		Car car2 = new Car("카니발");
		
		assertEquals(car1, car2); // 비교
	}
	
	// 아래 골뱅이테스트가 나중에 테스트 자동화 시킬거래요
	@DisplayName("싱글톤")
	@Test
	public void test() {
		// 싱글톤
		Car car1 = Car.getInstance("쏘렌토");
		Car car2 = Car.getInstance("카니발");

		System.out.println(car1 == car2);
		assertEquals(car1, car2); // 비교
	}

}
