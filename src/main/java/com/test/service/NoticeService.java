package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.domain.Criteria;
import com.test.domain.NoticeVO;

@Service
public interface NoticeService {

	public void register(NoticeVO notice);
	
	public NoticeVO get(Long no);
	
	public boolean modify(NoticeVO notice);
	
	public boolean remove(NoticeVO notice);
	
	// public List<NoticeVO> getList();
	
	public List<NoticeVO> getList(Criteria cri);
	
	public int getTotal(Criteria cri);
}
