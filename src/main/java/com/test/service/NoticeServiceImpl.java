package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.Criteria;
import com.test.domain.NoticeVO;
import com.test.mapper.NoticeMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
public class NoticeServiceImpl implements NoticeService {

	
	@Setter(onMethod_ = @Autowired)
	private NoticeMapper mapper;

	@Override
	public void register(NoticeVO notice) {
		
		mapper.insert(notice);
	}

	@Override
	public NoticeVO get(Long no) {
		
		return mapper.read(no);
	}

	@Override
	public boolean modify(NoticeVO notice) {

			mapper.update(notice);
		return mapper.update(notice) == 1;
	}

	@Override
	public boolean remove(NoticeVO notice) {
		
			mapper.delete(notice);
		return mapper.delete(notice) == 1;
	}

	@Override
	public List<NoticeVO> getList(Criteria cri) {
		
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		
		return mapper.getTotalCount(cri);
	}

//	@Override
//	public List<NoticeVO> getList() {
//		
//		return mapper.getList();
//	}

	
	
	
	
}
