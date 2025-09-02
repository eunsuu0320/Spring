package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyVO;

@SpringBootTest
public class ReplyMapperTest {

	@Autowired ReplyMapper replyMapper;
	
	@Test
	public void getList() {
		ReplyVO reply = new ReplyVO();
		reply.setBno(1L);
		reply.setFirst(1);
		reply.setLast(10);
		List<ReplyVO> list = replyMapper.getList(null);
		list.forEach(System.out::println);
	}
	
	
	@Ignore
	@Test
	public void insert() {
		//given
		ReplyVO reply = new ReplyVO();
		reply.setBno(1L);
		reply.setReply("이동섭 짜증나요");
		reply.setReplyer("홍길동");
		// when
		int result = replyMapper.insert(reply);
		// then
		assertEquals(result, 1);
	}
	
}
