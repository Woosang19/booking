package com.test.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.domain.Criteria;
import com.test.domain.NoticeVO;
import com.test.service.NoticeService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class NoticeMapperTests {

	
	@Setter(onMethod_ = @Autowired)
	private NoticeMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(notice -> log.info(notice));
//	}
//	
	
//	@Test
//	public void testPaging() {
//		
//		Criteria cri = new Criteria();
//		cri.setPageNum(3);
//		cri.setAmount(10);
//		
//		List<NoticeVO> list = mapper.getListWithPaging(cri);
//		list.forEach(notice -> log.info(notice));
//	}
	
//	@Test
//	public void testInsert() {
//		
//		NoticeVO notice = new NoticeVO();
//		notice.setTitle("20220119");
//		notice.setContents("20220119");
//		notice.setDelete_flag("1");
//		notice.setBuild_code(9);
//		
//		mapper.insert(notice);
//		
//		log.info(notice);
//	}
//	
//	@Test
//	public void testRead() {
//		
//		NoticeVO notice = mapper.read(39L);
//		
//		log.info(notice);
//	}
	
	@Test
	public void testDelete() {
		
		NoticeVO notice = new NoticeVO();
		notice.setNo(257);
		notice.setDelete_flag("1");
		
		int count = mapper.delete(notice);
		log.info("UPDATE COUNT: " + count);
	}
	
//	@Test
//	public void testUpdate() {
//		
//		NoticeVO notice = new NoticeVO();
//		notice.setNo(39);
//		notice.setTitle("123611");
//		notice.setContents("修正2");
//		notice.setDelete_flag("1");
//		
//		int count = mapper.update(notice);
//		log.info("UPDATE COUNT: " + count);
//	}
}
