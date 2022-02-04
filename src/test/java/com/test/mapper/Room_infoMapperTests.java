package com.test.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.domain.Room_infoVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class Room_infoMapperTests {

	@Setter(onMethod_ = @Autowired)
	private Room_infoMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(roominfo -> log.info(roominfo));
	}

	
//	@Test
//	public void testInsert() {
//		
//		Room_infoVO roominfo = new Room_infoVO();
//		roominfo.setRoom_num("212");
//		roominfo.setRoom_title("test");
//		roominfo.setMax(6);
//		roominfo.setAdult_cost(15000);
//		roominfo.setChild_cost(10000);
//		roominfo.setExplanation("test");
//		roominfo.setImages("test");
//		roominfo.setColor_code("#000011");
//		roominfo.setDelete_flag("0");
//		roominfo.setBuild_code(9);
//		
//		mapper.insert(roominfo);
//		
//		log.info(roominfo);
//	}
	
//	@Test
//	public void testRead() {
//		Room_infoVO roominfo = new Room_infoVO();
//		
//		log.info(roominfo);
//	}
//	
//	@Test
//	public void testDelete() {
//		log.info("DELETE Count :" + mapper.delete(60L));
//	}
	
	@Test
	public void testUpdate() {
		
		Room_infoVO roominfo = new Room_infoVO();
		roominfo.setNo(61);
		roominfo.setRoom_num("211");
		
		int count = mapper.update(roominfo);
		log.info("UPDATE COUNT: " + count);
	}
	
}
