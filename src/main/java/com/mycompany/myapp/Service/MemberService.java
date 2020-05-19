package com.mycompany.myapp.Service;

import javax.servlet.http.HttpSession;

import com.mycompany.myapp.VO.MemberVO;

public interface MemberService {
	
	//회권가입
	public void register(MemberVO memberVO) throws Exception;
	//로그인
	public MemberVO login(MemberVO memberVO, HttpSession session) throws Exception;
	
	
	public void logout(HttpSession session);
}
