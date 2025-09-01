package com.example.demo.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardVO;
import com.example.demo.common.Paging;



@Controller
public class BoardController {
	
	@Autowired BoardMapper boardMapper;
	
	@GetMapping("boardList")
	public String selectBoard(Model model, BoardVO board, Paging paging) {
		paging.setPageUnit(10);
		paging.setTotalRecord(boardMapper.boardTotalCount(board));
		board.setFirst(paging.getFirst());
		board.setLast(paging.getLast());
		model.addAttribute("boardList", boardMapper.selectBoard(board));
		return "boardList";
	}

}
