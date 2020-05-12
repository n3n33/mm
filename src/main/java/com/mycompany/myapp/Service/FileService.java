package com.mycompany.myapp.Service;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mycompany.myapp.VO.FileVO;

public interface FileService {
	//파일업로드
	public void write(FileVO fileVO, MultipartHttpServletRequest mpRequest) throws Exception;

}
