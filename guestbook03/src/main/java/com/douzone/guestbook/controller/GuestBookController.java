package com.douzone.guestbook.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.guestbook.repository.GuestbookRepository;
import com.douzone.guestbook.vo.GuestbookVo;

@Controller
public class GuestBookController {

	@Autowired
	private GuestbookRepository guestbookRepository;

	@RequestMapping("")
	public String index(Model model) {
		System.out.println(model);
		List<GuestbookVo> list = guestbookRepository.findAll();
		model.addAttribute("list", list);

		return "/WEB-INF/views/index.jsp";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(GuestbookVo vo) {
		System.out.println(vo);
		guestbookRepository.insert(vo);

		return "redirect:/";
	}

	
	@RequestMapping(value="/deleteform/{no}", method=RequestMethod.GET)
	public String deleteform(@PathVariable("no") Long no, Model model) {
		model.addAttribute("no",no);
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(GuestbookVo vo) {
		System.out.println(vo);
		guestbookRepository.delete(vo);

		return "redirect:/";
	}
	

}
