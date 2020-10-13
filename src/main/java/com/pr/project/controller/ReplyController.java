package com.pr.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pr.project.model.Reply;
import com.pr.project.service.ReplyService;

@Controller
public class ReplyController {
	@Autowired
	private ReplyService rs;
	
	@RequestMapping("insertReply")
	public String insert(Reply reply, Model model, HttpServletRequest request) {
		reply.setR_ip(request.getLocalAddr());
		int rnum = rs.getSeq();
		if(reply.getR_num()==reply.getR_ref()) {
			reply.setR_num(rnum);
			reply.setR_ref(rnum);
			reply.setR_level(0);
			reply.setR_step(0);
		} else {
			reply.setR_num(rnum);
			reply.setR_level(rs.selectLevel(reply.getR_ref())+1);
			int step = rs.selectStep(reply.getR_ref());
			reply.setR_step(step+1);
			rs.updateStep(reply);
		}
		int result = rs.insert(reply);
		model.addAttribute("result", result);
		return "boardview?bnum="+reply.getR_b_num();
	}
	
	@RequestMapping("updateReply")
	public String update(Reply reply, Model model) {
		int result = rs.update(reply);
		model.addAttribute("result", result);
		return "boardview?bnum="+reply.getR_b_num();
	}
	
	@RequestMapping("deleteReply")
	public String delete(Reply reply, Model model) {
		int result = rs.delete(reply.getR_num());
		model.addAttribute("result", result);
		return "boardview?bnum="+reply.getR_b_num();
	}

	@RequestMapping("replyList")
	public String list(int r_b_num, Model model) {
		List<Reply> replyList = rs.list(r_b_num);
		model.addAttribute("replyList", replyList);
		return "boardview?bnum="+r_b_num;
	}
}
