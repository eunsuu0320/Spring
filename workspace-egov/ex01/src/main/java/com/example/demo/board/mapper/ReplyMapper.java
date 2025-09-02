package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.ReplyVO;

@Mapper
public interface ReplyMapper {

	// 등록
	public int insert(ReplyVO reply);
	
	// 단건 조회
	public ReplyVO read(ReplyVO reply);
	
	// 삭제
	public int delete(long rno);
	
	// 업데이트
	public int update(long rno);
	
	// 전체 조회
	public List<ReplyVO> getList(ReplyVO reply);
	
	// 게시글의 댓글 수
	public int getCountByBno(long bno);
}
