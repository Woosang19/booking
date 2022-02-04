package com.test.mapper;

import java.util.List;

import com.test.domain.BookingVO;
import com.test.domain.Criteria;

public interface BookingMapper {
	
	public List<BookingVO> getList();
	
	public List<BookingVO> getListwithPaging(Criteria cri);
	
	public void insert(BookingVO booking);
	
	public void insertSelectKey(BookingVO booking);
	
	public BookingVO read(Long no);
	
	public int delete(Long no);
	
	public int update(BookingVO booking);
	
	public int getTotalCount(Criteria cri);
}
