package com.winter.app.board.qna;

import java.util.List;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;

public class QnADTO extends BoardDTO{
	
	private Long QnARef;
	private Long QnAStep;
	private Long QnADepth;
	private List<BoardFileDTO> fileDTOs;
	
	
	public Long getQnARef() {
		return QnARef;
	}
	public void setQnARef(Long qnARef) {
		QnARef = qnARef;
	}
	public Long getQnAStep() {
		return QnAStep;
	}
	public void setQnAStep(Long qnAStep) {
		QnAStep = qnAStep;
	}
	public Long getQnADepth() {
		return QnADepth;
	}
	public void setQnADepth(Long qnADepth) {
		QnADepth = qnADepth;
	}
	public List<BoardFileDTO> getFileDTOs() {
		return fileDTOs;
	}
	public void setFileDTOs(List<BoardFileDTO> fileDTOs) {
		this.fileDTOs = fileDTOs;
	}
	
	
	

}
