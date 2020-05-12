package com.mycompany.myapp.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mycompany.myapp.DAO.FileDAO;
import com.mycompany.myapp.VO.FileVO;
import com.mycompany.myapp.util.FileUtils;

public class FileServiceImpl implements FileService{
	
	@Resource(name="fileUtils")
	private FileUtils fileUtils;
	
	@Inject
	private FileDAO dao;
	
	@Override
	public void write(FileVO fileVO, MultipartHttpServletRequest mpRequest) throws Exception {
		// TODO Auto-generated method stub
		dao.inserFile(fileVO);
		
	}

}
