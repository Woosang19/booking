package com.test.controller;

import static org.junit.jupiter.api.Assertions.*;

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

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class Room_infoControllerTests {

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
				mockMvc.perform(MockMvcRequestBuilders.get("/sample/roominfo/list")
						.param("pageNum", "2")
						.param("amount", "50"))
				.andReturn()
				.getModelAndView()
				.getModelMap());
	}

//	@Test
//	public void testRegister() throws Exception{
//		
//		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/sample/roominfo/register")
//				.param("room_num", "19")
//				.param("room_title", "test")
//				.param("max", "6")
//				.param("adult_cost", "30000")
//				.param("child_cost", "15000")
//				.param("explanation", "test")
//				.param("images", "test")
//				.param("color_code", "#001111")
//				.param("delete_flag", "0")
//				.param("build_code", "9")).andReturn().getModelAndView().getViewName();
//			
//			log.info(resultPage);
//	}
	
	@Test
	public void testGet() throws Exception {
		
		log.info(mockMvc.perform(MockMvcRequestBuilders
				.get("/sample/roominfo/get")
				.param("no", "66"))
				.andReturn()
				.getModelAndView().getModelMap());
	}
	
//	@Test
//	public void testModify() throws Exception {
//		
//		String resultPage = mockMvc
//				.perform(MockMvcRequestBuilders.post("/sample/roominfo/modify")
//						.param("no", "66")
//						.param("room_num", "215")
//						.param("room_title", "titless")
//						.param("max", "6")).andReturn().getModelAndView().getViewName();
//	
//		log.info(resultPage);
//	}
	
	@Test
	public void testRemove() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/roominfo/remove")
				.param("no", "67")
				).andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
	
}
