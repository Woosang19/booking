package com.test.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.domain.BookingVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BookingMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BookingMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(booking -> log.info(booking));
	}
	
	@Test
	public void testInsert() {
		
		BookingVO booking = new BookingVO();
		booking.setRoom_no(19);
		booking.setName("test1");
		booking.setPhone("01011111111");
		booking.setAdult("2");
		booking.setChild("0");
		booking.setStart_date("20220219");
		booking.setEnd_date("20220223");
		booking.setPayment_flag("0");
		booking.setTotal_cost(1);
		booking.setCancel_flag("0");
		booking.setBank_name("bank");
		booking.setDelete_flag("0");
		booking.setBuild_code(9);
		
		mapper.insert(booking);
		
		log.info(booking);
	}
	

}
