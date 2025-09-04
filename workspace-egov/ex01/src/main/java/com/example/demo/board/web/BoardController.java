package com.example.demo.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;
import com.example.demo.common.Paging;


@RequestMapping("/board")
@Controller
public class BoardController {
	
	@Autowired BoardService boardSerivce;
	
	@GetMapping("/list")
	public String selectBoard(Model model, BoardVO board, Paging paging) {
		paging.setPageUnit(10);
		paging.setTotalRecord(boardSerivce.boardTotalCount(board));
		board.setFirst(paging.getFirst());
		board.setLast(paging.getLast());
		model.addAttribute("boardList", boardSerivce.selectBoard(board));
		return "boardList";
	}
	
	@GetMapping("/board")
	public String board(Model model, @RequestParam("bno") int bno) {
		model.addAttribute("board", boardSerivce.selectBoardByNo(bno));
		return "board";
	}
	
	//등록

}
