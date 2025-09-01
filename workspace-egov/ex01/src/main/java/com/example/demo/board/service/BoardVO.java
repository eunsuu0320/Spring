package com.example.demo.board.service;

import java.util.Date;

import com.example.demo.common.SearchVO;
import com.example.demo.emp.service.DeptVO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO extends SearchVO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updatedate;
	
	
}
