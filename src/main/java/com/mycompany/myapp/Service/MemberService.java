package com.mycompany.myapp.Service;

import javax.servlet.http.HttpSession;

import com.mycompany.myapp.VO.MemberVO;

public interface MemberService {
	
	//ȸ�ǰ���
	public void register(MemberVO memberVO) throws Exception;
	//�α���
	public MemberVO login(MemberVO memberVO, HttpSession session) throws Exception;
	
	
	public void logout(HttpSession session);
}
