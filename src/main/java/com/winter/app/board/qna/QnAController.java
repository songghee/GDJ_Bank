package com.winter.app.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.board.BoardDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnAController {
	
	@Autowired
	public QnAService qnaService;
	
	
	//detail
	@GetMapping("detail")
	public String getDetail(BoardDTO boardDTO, Model model)throws Exception{
		boardDTO = qnaService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "board/detail";
		
	}
	
	//List
	@GetMapping("list")
	public String getList(Pager pager, Model model)throws Exception{
		List<BoardDTO> ar = qnaService.getList(pager);
		model.addAttribute("list" , ar);
		
		return "board/list";
		
		
	}
	

}
