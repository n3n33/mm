package com.mycompany.myapp.Service;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mycompany.myapp.VO.FileVO;

public interface FileService {
	//���Ͼ��ε�
	public void write(FileVO fileVO, MultipartHttpServletRequest mpRequest) throws Exception;

}
