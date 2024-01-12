package com.winter.app.board;

import java.util.List;

public interface BoardDAO {

	//totalCount
	public Long getTotalCount()throws Exception;
	
	//list
	public List<BoardDTO> getList()throws Exception;
	
	//detail
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception;
	
	//add
	public int setAdd(BoardDTO boardDtO)throws Exception;
	
	//delete
	public int setUpdate(BoardDTO boardDtO)throws Exception;
}
