package com.pr.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pr.project.model.Reply;

@Repository
public class ReplyDaoImpl implements ReplyDao{
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public int insert(Reply reply) {
		return sst.insert("replyns", reply);
	}

	@Override
	public int getSeq() {
		return sst.selectOne("replyns");
	}

	@Override
	public int selectLevel(int r_ref) {
		return sst.selectOne("replyns", r_ref);
	}

	@Override
	public int selectStep(int r_ref) {
		return sst.selectOne("replyns", r_ref);
	}

	@Override
	public void updateStep(Reply reply) {
		sst.update("replyns", reply);
	}

	@Override
	public int update(Reply reply) {
		return sst.update("replyns", reply);
	}

	@Override
	public int delete(int r_num) {
		return sst.update("replyns", r_num);
	}

	@Override
	public List<Reply> list(int r_b_num) {
		return sst.selectList("replyns", r_b_num);
	}
}
