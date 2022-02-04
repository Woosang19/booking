package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.domain.Criteria;
import com.test.domain.NoticeVO;

@Mapper
public interface NoticeMapper {
	
	public List<NoticeVO> getList();
	
	public List<NoticeVO> getListWithPaging(Criteria cri);
	
	public void insert(NoticeVO notice);
	
	public void insertSelectKey(NoticeVO notice);
	
	public NoticeVO read(Long no);
	
	public int delete(NoticeVO notice);
	
	public int update(NoticeVO notice);
	
	public int getTotalCount(Criteria cri);
}
