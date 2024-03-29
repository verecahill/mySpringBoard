package com.nxeden.app.board.mapper;

import java.util.List;

import com.nxeden.app.board.dto.BoardDto;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    List<BoardDto> selectBoardList() throws Exception;
    void insertBoard(BoardDto board) throws Exception;
    void updateHitCount(int boardIdx) throws Exception;
    BoardDto selectBoardDetail(int boardIdx) throws Exception;
	void updateBoard(BoardDto board);
	void deleteBoard(int boardIdx);
}