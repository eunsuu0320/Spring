package com.example.demo.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyVO;
import com.example.demo.common.Paging;

@RestController
public class ReplyController {
	
	@Autowired ReplyMapper replyMapper;

	// 등록
	@PostMapping("/reply")
	public int insert(@RequestBody ReplyVO reply) {
		int result = replyMapper.insert(reply);
		return result;
	}
	
	// 수정
	@PutMapping("/reply/{rno}")
	public String update() {
		return "";
	}
	
	// 삭제
	@DeleteMapping("/reply/{rno}")
	public String delete() {
		return "";
	}
	
	// 전체 조회
	@GetMapping("/board/{bno}/reply") // 저기 {}안에 있는 값 불러오는 게 @PathVariable 이거
	public List<ReplyVO> list(@PathVariable long bno, ReplyVO reply) {
		reply.setFirst(1);
		reply.setLast(10);
		return replyMapper.getList(reply);
	}
	
	// 단건 조회
	@GetMapping("/reply/{rno}")
	public String get() {
		return "";
	}
}
