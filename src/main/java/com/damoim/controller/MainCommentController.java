package com.damoim.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.damoim.model.vo.MainComment;
import com.damoim.service.MainCommentService;

@Controller
public class MainCommentController {

	@Autowired
	private MainCommentService service;
	
	@ResponseBody
	@PostMapping("/mainComment")
	public void insertComment (MainComment mainComment) {
		System.out.println(mainComment);
		service.insertComment(mainComment);
		System.out.println("댓글 등록 성공!");
		
	}
	

}
