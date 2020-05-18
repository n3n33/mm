package com.mycompany.myapp.DAO;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.VO.MemberVO;


@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "MemberMapper";
	

	@Override
	public void register(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(NAMESPACE+".register", vo);
		
	}
	
}
