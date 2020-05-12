package com.mycompany.myapp;


import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.myapp.DAO.FileDAO;
import com.mycompany.myapp.VO.FileVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class FileDAOTest {
	
	
	
	@Inject
	private FileDAO dao;
	
	@Test
	public void testInsertFile() throws Exception {
		FileVO vo = new FileVO();
		vo.setFile_num(0);
		vo.setDate(0);
		vo.setOriginal_file_name("original");
		vo.setStored_file_name("stored");
		vo.setFile_size(12345);
		
		dao.inserFile(vo);
	}
}
