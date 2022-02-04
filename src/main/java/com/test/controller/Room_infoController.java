package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test.domain.Criteria;
import com.test.domain.PageDTO;
import com.test.domain.Room_infoVO;
import com.test.service.Room_infoService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("sample/roominfo/*")
@AllArgsConstructor
public class Room_infoController {
	
	private Room_infoService service;
	
	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);

	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list(Criteria cri, Model model) {
		logger.info("list" + cri);
		model.addAttribute("list", service.getList(cri));
		
		int total = service.getTotal(cri);
		logger.info("total" + total);
		model.addAttribute("pageMaker", new PageDTO(cri, total));
		return "sample-t/roominfo/list";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(Room_infoVO roominfo, RedirectAttributes rttr) {
		logger.info("register");
		service.register(roominfo);
		rttr.addFlashAttribute("result", roominfo.getNo());
		return "redirect:list";
	}
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@RequestMapping(value="/get", method = RequestMethod.GET)
	public String get(@RequestParam(value="no", required=false) @ModelAttribute("cri") Long no, Model model) {
		logger.info("get");
		
		model.addAttribute("roominfo", service.get(no));
		return "sample-t/roominfo/get";
	}
	
	@RequestMapping(value="/modify", method = RequestMethod.POST)
	public String modify(Room_infoVO roominfo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		logger.info("modify" + roominfo);
		
		if(service.modify(roominfo)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		return "redirect:list";
	}
	
	@GetMapping("/modify")
	public void modify(@RequestParam(value="no", required=false) Long no, Model model) {
		model.addAttribute("notice", service.get(no));
	}
	
	@RequestMapping(value="/remove", method = RequestMethod.POST)
	public String remove(Room_infoVO roominfo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		logger.info("remove" + roominfo);
		
		if(service.remove(roominfo)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		return "redirect:list";
	}
}
