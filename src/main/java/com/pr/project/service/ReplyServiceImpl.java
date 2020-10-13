package com.pr.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pr.project.dao.ReplyDao;
import com.pr.project.model.Reply;

@Service
public class ReplyServiceImpl implements ReplyService{
	@Autowired
	private ReplyDao rd;

	@Override
	public int insert(Reply reply) {
		return rd.insert(reply);
	}

	@Override
	public int getSeq() {
		return rd.getSeq();
	}

	@Override
	public int selectLevel(int r_ref) {
		return rd.selectLevel(r_ref);
	}

	@Override
	public int selectStep(int r_ref) {
		return rd.selectStep(r_ref);
	}

	@Override
	public void updateStep(Reply reply) {
		rd.updateStep(reply);
	}

	@Override
	public int update(Reply reply) {
		return rd.update(reply);
	}

	@Override
	public int delete(int r_num) {
		return rd.delete(r_num);
	}

	@Override
	public List<Reply> list(int r_b_num) {
		return rd.list(r_b_num);
	}
}
