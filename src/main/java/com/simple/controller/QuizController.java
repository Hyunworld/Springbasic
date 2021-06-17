package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;
import com.simple.command.Quiz02VO;
import com.simple.command.Quiz03VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	//문제1 화면처리
	@RequestMapping("/quiz01")
	public void quiz01() {
		
	}
	
	@RequestMapping("/sendBirth")
	public String sendBirth(Quiz01VO vo, Model model) {
		
		String result = vo.getYear() + vo.getMonth() + vo.getDay();
		System.out.println(result);
		//화면으로 전달할 모델값
		model.addAttribute("year", vo.getYear() );
		model.addAttribute("month", vo.getMonth() );
		model.addAttribute("day",  vo.getDay() );
		
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public void quiz02() {
				
	}
	
	@RequestMapping("join")
	public String join(@ModelAttribute("vo") Quiz02VO vo) {
		System.out.println(vo.toString());
		System.out.println(vo.getEmail());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		return"quiz/quiz02_ok";
	}

	@RequestMapping("/quiz03")
	public void quiz03() {
		
	}
	
	@RequestMapping("join2")
	public String join(@ModelAttribute("vo") Quiz03VO vo, Model model) {
		if(vo.getId().length() == 0) {
			
			model.addAttribute("ero", "아이디를 입력하세요");
			return "/quiz/quiz03_ok";
			
		} else if(!(vo.getPw().equals(vo.getPw_check()))) {
			System.out.println(vo.getPw());
			System.out.println(vo.getPw_check());
			model.addAttribute("ero", "비밀번호를 확인하세요");
			return "/quiz/quiz03_ok";
			
		} else {
			
			model.addAttribute("ero", vo.getId() + "님 환영합니다");
			
			return "/quiz/quiz03_ok";
		}
		
	}
	
	
}
