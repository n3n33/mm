package com.mycompany.myapp.DAO;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.VO.FileVO;


@Repository
public class FileDAOImpl implements FileDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "FileMapper";
	

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserFile(FileVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(NAMESPACE+".insertFile", vo);
		
	}
	
}
