package com.pr.project.dao;

import java.util.List;

import com.pr.project.model.Reply;

public interface ReplyDao {

	int insert(Reply reply);

	int getSeq();

	int selectLevel(int r_ref);

	int selectStep(int r_ref);

	void updateStep(Reply reply);

	int update(Reply reply);

	int delete(int r_num);

	List<Reply> list(int r_b_num);


}
