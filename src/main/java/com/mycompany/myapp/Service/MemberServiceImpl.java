package com.mycompany.myapp.Service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.mycompany.myapp.DAO.MemberDAO;
import com.mycompany.myapp.VO.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO dao;
	

	@Override
	public void register(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		dao.register(memberVO);
	}

	@Override
	public MemberVO login(MemberVO memberVO, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		session.setAttribute("userId", memberVO.getUserId());
		return dao.login(memberVO);
	}


	@Override
	public void logout(HttpSession session) {
		session.invalidate();
		
	}



}
