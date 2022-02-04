package com.test.service;

import static org.junit.jupiter.api.Assertions.*;

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
public class Room_infoServiceTests {

	@Setter(onMethod_ = {@Autowired(required = false)})
	public Room_infoService service;
	
	@Test
	public void testExist() {
		
		assertNotNull(service);
		log.info(service);
	}

//	@Test
//	public void testRegister() {
//		
//		Room_infoVO roominfo = new Room_infoVO();
//		roominfo.setRoom_num("215");
//		roominfo.setRoom_title("test");
//		roominfo.setMax(6);
//		roominfo.setAdult_cost(25000);
//		roominfo.setChild_cost(15000);
//		roominfo.setExplanation("test");
//		roominfo.setImages("test");
//		roominfo.setColor_code("#000011");
//		roominfo.setDelete_flag("0");
//		roominfo.setBuild_code(9);
//		
//		service.register(roominfo);
//		
//		log.info("生成する掲示板番号：" + roominfo.getNo());
//	}

//	@Test
//	public void testGetList() {
//		service.getList().forEach(roominfo -> log.info(roominfo));
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("Remove result:" + service.remove(65L));
//	}
	
	@Test
	public void testUpdate() {
		Room_infoVO roominfo = service.get(66L);
		
		if(roominfo == null) {
			return;
		}
		
		roominfo.setRoom_title("修正title");
		log.info("modify result:" + service.modify(roominfo));
	}
}
