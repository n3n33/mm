package com.mycompany.myapp.Service;

import javax.inject.Inject;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mycompany.myapp.DAO.MemberDAO;
import com.mycompany.myapp.VO.MemberVO;

public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO dao;
	

	@Override
	public void register(MemberVO memberVO, MultipartHttpServletRequest mpRequest) throws Exception {
		// TODO Auto-generated method stub
		dao.register(memberVO);
	}

}
