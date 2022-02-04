package com.test.mapper;

import java.util.List;

import com.test.domain.Criteria;
import com.test.domain.Room_infoVO;

public interface Room_infoMapper {
	
public List<Room_infoVO> getList();
	
	public List<Room_infoVO> getListWithPaging(Criteria cri);
	
	public void insert(Room_infoVO roominfo);
	
	public void insertSelectKey(Room_infoVO roominfo);
	
	public Room_infoVO read(Long no);
	
	public int delete(Room_infoVO roominfo);
	
	public int update(Room_infoVO roominfo);
	
	public int getTotalCount(Criteria cri);
}
