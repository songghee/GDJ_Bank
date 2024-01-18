package com.winter.app.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	@ModelAttribute("bbs")
	public Integer getKind() {
		return 1;
	}
	
	@ModelAttribute("board")
	public String getBoard() {
		return "qna";
	}
	
	@PostMapping("delete")
	public String setDelete(QnaDTO boardDTO)throws Exception{
		boardDTO.setFlag(1);
		int result = qnaService.setDelete(boardDTO);
		return "redirect:./list";
	}
	
	@GetMapping("reply")
	public String setReply(BoardDTO boardDTO, Model model)throws Exception{
		model.addAttribute("boardDTO", boardDTO);
		
		return "board/reply";
	}
	
	@PostMapping("reply")
	public String setReply(QnaDTO qnaDTO, MultipartFile [] attachs)throws Exception{
		int result = qnaService.setReply(qnaDTO, attachs);
		
		return "redirect:./list";
	}
	
	@GetMapping("update")
	public String setUpdate(BoardDTO boardDTO, Model model)throws Exception{
		boardDTO = qnaService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "board/update";
	}
	
	@PostMapping("update")
	public String setUpdate(BoardDTO boardDTO, MultipartFile[] attachs)throws Exception{
		int result = qnaService.setUpdate(boardDTO, attachs);
		return "redirect:./list";
	}
	
	
	@GetMapping("add")
	public String setAdd()throws Exception{
		return "board/add";
	}
	
	@PostMapping("add")
	public String setAdd(BoardDTO boardDTO, MultipartFile [] attachs)throws Exception{
		int result = qnaService.setAdd(boardDTO, attachs);
		return "redirect:./list";
	}
	
	
	@GetMapping("detail")
	public String getDetail(BoardDTO boardDTO, Model model)throws Exception{
		boardDTO = qnaService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "board/detail";
	}
	
	@GetMapping("list")
	public String getList(Pager pager, Model model)throws Exception{
		
		List<BoardDTO> ar =qnaService.getList(pager);

		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
		
		return "board/list";
	}
}
