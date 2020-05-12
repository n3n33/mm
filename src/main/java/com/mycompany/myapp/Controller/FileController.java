package com.mycompany.myapp.Controller;



import org.apache.taglibs.standard.lang.jstl.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mycompany.myapp.Service.FileService;
import com.mycompany.myapp.VO.FileVO;

public class FileController {
	FileService service;
	
	public void writeview() throws Exception {
		Logger.info("writeview");
	}
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(FileVO fileVO, MultipartHttpServletRequest mpRequest) throws Exception{
		Logger.info("write");
		service.write(fileVO, mpRequest);
		
		return "redirect:/board/list";
	}
}
