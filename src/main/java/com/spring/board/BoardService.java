package com.spring.board;

import java.util.List;

public interface BoardService {

	//3. 메소드 : 
	//insertBoard(), updateBoard, deleteBoard(), 	<== 리턴 값이 없다. void
	//getBoard() : BoardDTO 에 담아서 전송, 가져온 레코드가 1개
	//getBoardList() : 각각의 레코드를 DTO (1개), ArrayList에 DTO 객체를 담아서 리턴
	//3-1. 글 등록 처리: insertBoard()
	void insertBoard(BoardDTO dto);

	//3-2. 글 수정 처리 메소드: updateBoard()
	void updateBoard(BoardDTO dto);

	//3-3. 글 삭제 처리 메소드: deleteBoard() : 
	void deleteBoard(BoardDTO dto);

	//3-4. 글 상세 조회 처리 메소드: getBoard() : 레코드 1개를 DB에서 select 해서 DTO 객체에 담아서 리턴
	BoardDTO getBoard(BoardDTO dto);

	//3-5. 글 목록 처리 메소드: getBoardList() : 많은 레코드
	List<BoardDTO> getBoardList(BoardDTO dto);

}