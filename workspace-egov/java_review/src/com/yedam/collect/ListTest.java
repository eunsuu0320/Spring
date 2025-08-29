package com.yedam.collect;
/*
 * List
 * Set
 * Map
 * 
 * 과제
 * ArrayList 와 LinkedList 차이점과 언제 사용하는지?
 * 
 * */

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ListTest {
	
	@DisplayName("List ")
	@Test
	public void test1() {
		List<String> list = new ArrayList<>();
		list.add("사과");
		list.add("바나나");
		list.add("사과");
		assertEquals(list.size(), 3);
		
		Set<String> set = new HashSet<>(list);
		assertEquals(set.size(), 3); // list 와 set 으로 자유롭게 변환 가능. set 으로 변환되면 중복값 무시함
	}
	
	@DisplayName("Set ")
	@Test
	public void test2() {
		Set<String> list = new HashSet<>();
		list.add("사과");
		list.add("바나나");
		list.add("사과"); // 중복 무시
		assertEquals(list.size(), 2);
	}
	
	@DisplayName("Map ")
	@Test
	public void test3() {
		// 검색할 때는 map 사용
		Map<String, String> map = new HashMap<>();
		map.put("100", "홍길동");
		map.put("101", "김유신");
		
		map.get("100"); // 검색속도 1
	}
}
