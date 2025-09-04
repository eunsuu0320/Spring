package com.example.demo.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BoardService {
	// 전체조회
	List<BoardVO> selectBoard(BoardVO board);

	// 카운트
	int boardTotalCount(BoardVO board);
	
	// 단건 조회
	BoardVO selectBoardByNo(int bno);
}
