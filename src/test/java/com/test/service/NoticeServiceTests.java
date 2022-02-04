package com.test.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.domain.NoticeVO;


import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class NoticeServiceTests {

	@Setter(onMethod_ = {@Autowired(required = false)})
	public NoticeService service; 

//	@Test
//	public void testExist() {
//
//		assertNotNull(service);
//		log.info(service);
//	}
//
//	@Test
//	public void testRegister() {
//		
//		NoticeVO notice = new NoticeVO();
//		notice.setTitle("Title");
//		notice.setContents("Contents");
//		notice.setDelete_flag("1");
//		notice.setBuild_code(9);
//		
//		service.register(notice);
//		
//		log.info("生成する掲示板の番号：" + notice.getNo());
//	}
	
//	@Test
//	public void testGetList() {
//		service.getList().forEach(notice -> log.info(notice));
//	}
//	
//	@Test
//	public void testGet() {
//		log.info(service.get(52L));
//	}
	
	@Test
	public void testDelete() {
		NoticeVO notice = service.get(256L);
		
		if(notice == null) {
			return;
		}
		
		notice.setDelete_flag("1");
		log.info("MODIFY RESULT: " + service.remove(notice));
	}
	
//	@Test
//	public void testUpdate() {
//		NoticeVO notice = service.get(51L);
//		
//		if(notice == null) {
//			return;
//		}
//		
//		notice.setTitle("修正Title");
//		log.info("MODIFY RESULT: " + service.modify(notice));
//	}
	
}
