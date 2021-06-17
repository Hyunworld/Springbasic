package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;


@Controller
@RequestMapping("/service")
public class BoardServiceController {

	@Autowired
	@Qualifier("boardService")
	private BoardService boardService;
	
	@RequestMapping("/boardRegister")
		public void boardRegister() {
		
	}
		
	@RequestMapping("/boardForm")
		public String bardForm(BoardVO vo) {
			
			return "/service/boardResult";
	}
	
	@RequestMapping("/boardList")
	public void boardList(Model model) {
		
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
		
	}
		
	
	//결과 화면
	@RequestMapping("/boardResult")
	public void scoreResult() {
		
	}
	
	@RequestMapping("/boardDelete")
	public String delete(@RequestParam("num") int num) {
		
		boardService.boardDelete(num);
		
		
		return "redirect:/service/boardList";
	}

}
