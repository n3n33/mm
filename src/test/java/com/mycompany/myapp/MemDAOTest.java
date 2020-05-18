package com.mycompany.myapp;


import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.myapp.DAO.MemberDAO;
import com.mycompany.myapp.VO.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MemDAOTest {
	
	
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testInsertFile() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserId("test");
		vo.setUserPw("test");		
		dao.register(vo);
		System.out.print("success");
	}
}
