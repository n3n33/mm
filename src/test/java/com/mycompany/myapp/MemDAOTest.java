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
	
	//If you checking the working right, remove the block
	
	@Inject
	private MemberDAO dao;
	
	//TO check the Data insert into the Database
	/*
	 * @Test public void testInsertFile() throws Exception { MemberVO vo = new
	 * MemberVO(); vo.setUserId("test"); vo.setUserPw("test"); dao.register(vo);
	 * System.out.print("success"); }
	 */
	
	// To check the SQL that select the data correctly
	@Test
	public void testSelect() throws Exception{
		MemberVO vo = new MemberVO();
		dao.login(vo);
		System.out.println("success");
	}
	
}
