package com.mycompany.myapp.DAO;

import javax.servlet.http.HttpSession;

import com.mycompany.myapp.VO.MemberVO;

public interface MemberDAO {
	
	public void register(MemberVO vo);
	
	public MemberVO login(MemberVO vo);
	
	public void logout(HttpSession session);
}
