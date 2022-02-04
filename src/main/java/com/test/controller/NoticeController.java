package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.domain.Criteria;
import com.test.domain.NoticeVO;
import com.test.domain.PageDTO;
import com.test.service.NoticeService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("sample/notice/*")
@AllArgsConstructor
public class NoticeController {
	
	private NoticeService service;
	
	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);
	
//	@GetMapping("/list")
//	public void list(Model model) {
//	
//		model.addAttribute("list", service.getList());
//	}
	
//	@RequestMapping(value="/list", method = RequestMethod.GET)
//	public String list(Model model) throws Exception{
//		logger.info("list...");
//		
//		model.addAttribute("list", service.getList());
//		return "sample-t/notice/list";
//	}

	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list(Criteria cri, Model model) {
		logger.info("list" + cri);
		model.addAttribute("list", service.getList(cri));
		//model.addAttribute("pageMaker", new PageDTO(cri, 51));
		
		int total = service.getTotal(cri);
		
		logger.info("total" + total);
		
		model.addAttribute("pageMaker", new PageDTO(cri, total));
		
		return "sample-t/notice/list";
	}
	
//	@GetMapping("/list")
//	public void lsit(Criteria cri, Model model) {
//	
//		model.addAttribute("list", service.getList(cri));
//		//model.addAttribute("pageMaker", new PageDTO(cri, 51));
//		
//		int total = service.getTotal(cri);
//		
//		logger.info("total" + total);
//		model.addAttribute("pageMaker", new PageDTO(cri, total));
//	}
	
	@PostMapping("/register")
	public String register(NoticeVO notice, RedirectAttributes rttr) {
		logger.info("register..." + notice);
		
		
		service.register(notice);
		rttr.addFlashAttribute("result", notice.getNo());
		return "redirect:list";
	}
	
	@GetMapping("/register")
	public void register() {
		
	}
	
//	@RequestMapping(value="/get", method = RequestMethod.GET)
//	public String get(@RequestParam(value="no", required=false) @ModelAttribute("cri") Long no, Model model) {
//		logger.info("get");
//		
//		model.addAttribute("notice", service.get(no));
//		return "sample-t/notice/get";
//	}
	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("no") Long no, @ModelAttribute("cri")
	Criteria cri, Model model) {
		
		model.addAttribute("notice", service.get(no));
	}
	
	@PostMapping("/modify")
	public String modify(NoticeVO notice, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		System.out.println("modify.."+service.modify(notice));
		
		if(service.modify(notice)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		return "redirect:/sample/notice/list";
	}
	


	
	@PostMapping("/remove")
	public String remove(NoticeVO notice, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		
		System.out.println("remove.."+service.remove(notice));
		if(service.remove(notice)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		return "redirect:/sample/notice/list";
	}
}
