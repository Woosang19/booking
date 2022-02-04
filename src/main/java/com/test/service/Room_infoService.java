package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.domain.Criteria;
import com.test.domain.Room_infoVO;

@Service
public interface Room_infoService {
	
public void register(Room_infoVO roominfo);
	
	public Room_infoVO get(Long no);
	
	public boolean modify(Room_infoVO roominfo);
	
	public boolean remove(Room_infoVO roominfo);
	
	// public List<NoticeVO> getList();
	
	public List<Room_infoVO> getList(Criteria cri);
	
	public int getTotal(Criteria cri);
}
