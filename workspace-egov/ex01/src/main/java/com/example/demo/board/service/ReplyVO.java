package com.example.demo.board.service;

import java.util.Date;

import com.example.demo.common.SearchVO;

import lombok.Data;

@Data
public class ReplyVO extends SearchVO {
	private long rno;
	private long bno;
	private String reply;
	private String replyer;
	private Date replydate;
	private Date updatedate;
}
