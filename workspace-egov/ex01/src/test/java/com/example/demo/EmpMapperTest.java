package com.example.demo;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.service.EmpVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpMapperTest {

	@Autowired EmpMapper empMapper;
	
	@DisplayName("전체조회")
//	@Test
	public void selectEmp() {
		EmpVO vo = new EmpVO();
		vo.setDepartmentId(50L);
		vo.setFirst(1);
		vo.setLast(10);
		List<EmpVO> list = empMapper.selectEmp(vo);
		list.forEach(emp -> System.out.println(emp));
	}
	
	@DisplayName("단건조회")
	@Test
	public void selectEmpById() {
		EmpVO empVO = empMapper.selectEmpById(100L);
		log.warn(empVO.getDept().getDepartmentName());
	}
	
	@DisplayName("등록")
//	@Test
	public void insertEmp() {
		EmpVO emp = EmpVO.builder().employeeId(400L).email("sss").lastName("asd").jobId("IT_PROG").hireDate(new Date()).build();
		int result = empMapper.insertEmp(emp);
		System.out.println(result + "건이 처리됨");
	}
}
