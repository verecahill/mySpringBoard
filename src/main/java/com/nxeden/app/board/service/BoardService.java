package com.nxeden.app.board.service;

import java.util.List;
import com.nxeden.app.board.dto.BoardDto;

public interface BoardService {

    List<BoardDto> selectBoardList() throws Exception;

    void insertBoard(BoardDto board) throws Exception;

    BoardDto selectBoardDetail(int boardIdx) throws Exception;

	void deleteBoard(int boardIdx) throws Exception;

	void updateBoard(BoardDto board) throws Exception;

    
}