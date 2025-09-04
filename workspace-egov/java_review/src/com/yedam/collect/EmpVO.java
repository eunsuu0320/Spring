package com.yedam.collect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class EmpVO {
	// 필드 선언
	final private int empno;
	final private String ename;
	private int dept;
	
	
}
