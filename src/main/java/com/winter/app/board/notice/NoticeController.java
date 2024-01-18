package com.winter.app.board.notice;

import java.lang.reflect.Member;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardService;
import com.winter.app.util.Pager;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	@Qualifier("noticeService")
	private BoardService boardService;
	
	@ModelAttribute("bbs")
	public Integer getKind() {
		return 0;
	}
	
	@ModelAttribute("board")
	public String getBoard() {
		return "notice";
	}
	
	@GetMapping("update")
	public String setUpdate(BoardDTO boardDTO, Model model)throws Exception{
		boardDTO = boardService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "board/update";
	}
	
	@PostMapping("update")
	public String setUpdate(BoardDTO boardDTO, MultipartFile[] attachs)throws Exception{
		int result = boardService.setUpdate(boardDTO, attachs);
		return "redirect:./detail?boardNum="+boardDTO.getBoardNum();
	}
	
	@PostMapping("delete")
	public String setDelete(BoardDTO boardDTO)throws Exception{
		int result=boardService.setDelete(boardDTO);
		return "redirect:./list";
	}
	
	@GetMapping("add")
	public String setAdd()throws Exception{
		return "board/add";
	}
	@PostMapping("add")
	public String setAdd(BoardDTO boardDTO, MultipartFile [] attachs)throws Exception{
		MemberDTO memberDTO= (memberDTO)SessionAttribute.getUserName();
		boardDTO.setBoardWriter(getUserName);
		
		int result = boardService.setAdd(boardDTO, attachs);
		return "redirect:./list";
	}
	
	//detail
	@GetMapping("detail")
	public String getDetail(BoardDTO boardDTO, Model model)throws Exception{
		boardDTO = boardService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "board/detail";
	}
	
	//list
	//@RequestMapping(value = "list", method = RequestMethod.GET)
	@GetMapping("list")
	public String getList(Pager pager, Model model)throws Exception{
		
		List<BoardDTO> ar = boardService.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
		return "board/list";
	}

}