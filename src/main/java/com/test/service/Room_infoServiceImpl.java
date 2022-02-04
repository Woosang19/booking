package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.Criteria;
import com.test.domain.Room_infoVO;
import com.test.mapper.Room_infoMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Service
@AllArgsConstructor
public class Room_infoServiceImpl implements Room_infoService{
	
	@Setter(onMethod_ = @Autowired)
	private Room_infoMapper mapper;
	
	@Override
	public void register(Room_infoVO roominfo) {
		
		mapper.insert(roominfo);
	}

	@Override
	public Room_infoVO get(Long no) {
			
		return mapper.read(no);
	}

	@Override
	public boolean modify(Room_infoVO roominfo) {
		
		return mapper.update(roominfo) == 1;
	}

	@Override
	public boolean remove(Room_infoVO roominfo) {
		
		return mapper.delete(roominfo) == 1;
	}

	@Override
	public List<Room_infoVO> getList(Criteria cri) {
		
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		
		return mapper.getTotalCount(cri);
	}

}
