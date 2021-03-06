package com.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.test.service.NoticeService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class NoticeControllerTests {
	
	@Setter(onMethod_ = {@Autowired(required = false)})
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
		
	}
	
	@Test
	public void testListPaging() throws Exception {
		
		log.info(
			mockMvc.perform(MockMvcRequestBuilders.get("/sample/notice/list")
					.param("pageNum", "2")
					.param("amount", "50"))
			.andReturn()
			.getModelAndView()
			.getModelMap());
	}
	
//	@Test
//	public void testRegister()throws Exception{
//		
//		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/sample/notice/register")
//			.param("title", "testtitle")
//			.param("contents", "testcontents")
//			.param("delete_flag", "1")
//			.param("build_code", "9")).andReturn().getModelAndView().getViewName();
//		
//		log.info(resultPage);
//	}
	
//	@Test
//	public void testGet() throws Exception {
//		
//		log.info(mockMvc.perform(MockMvcRequestBuilders
//			.get("/sample/notice/get")
//			.param("no", "39"))
//			.andReturn()
//			.getModelAndView().getModelMap());
//	}
	
	@Test
	public void testModify() throws Exception {
		
		String resultPage = mockMvc
			.perform(MockMvcRequestBuilders.post("/sample/notice/modify")
					.param("no", "256")
					.param("title", "??????Titlessss")
					.param("contents", "??????contentsssss")
					.param("delete_flag", "1")
					.param("build_code", "9")).andReturn().getModelAndView().getViewName();
			
		log.info(resultPage);
	}
	
//	@Test
//	public void testRemove() throws Exception {
//		
//		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/sample/notice/remove")
//			.param("no", "256")
//			.param("delete_flag", "1")
//			).andReturn().getModelAndView().getViewName();
//		
//		log.info(resultPage);
//	}
}
