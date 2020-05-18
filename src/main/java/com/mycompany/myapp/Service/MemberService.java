package com.mycompany.myapp.Service;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mycompany.myapp.VO.MemberVO;

public interface MemberService {
	//파일업로드
	public void register(MemberVO memberVO, MultipartHttpServletRequest mpRequest) throws Exception;

}
