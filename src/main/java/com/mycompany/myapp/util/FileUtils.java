package com.mycompany.myapp.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.mycompany.myapp.VO.FileVO;

@Component("fileUtils")
public class FileUtils {
	private static final String filePath = "C:\\mp\\file\\"; // ������ ����� ��ġ
	
	public List<Map<String, Object>> parseInsertFileInfo(FileVO fileVO, 
			MultipartHttpServletRequest mpRequest) throws Exception{
		
		/*
			Iterator�� �����͵��� ����ü? ���� �÷������κ��� ������ ���� �� �ִ� �������̽��Դϴ�.
			List�� �迭�� ���������� �������� ������ ����������, Map���� Ŭ�������� ���������� ������ ���� �����ϴ�.
			Iterator�� �̿��Ͽ� Map�� �ִ� �����͵��� while���� �̿��Ͽ� ���������� �����մϴ�.
		*/
		
		Iterator<String> iterator = mpRequest.getFileNames();
		
		MultipartFile multipartFile = null;
		String original_file_name = null;
		String originalFileExtension = null;
		String stored_file_name = null;
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		Map<String, Object> listMap = null;
		
		int bno = fileVO.getFile_num();
		
		File file = new File(filePath);
		if(file.exists() == false) {
			file.mkdirs();
		}
		
		while(iterator.hasNext()) {
			multipartFile = mpRequest.getFile(iterator.next());
			if(multipartFile.isEmpty() == false) {
				original_file_name = multipartFile.getOriginalFilename();
				originalFileExtension = original_file_name.substring(original_file_name.lastIndexOf("."));
				stored_file_name = getRandomString() + originalFileExtension;
				
				file = new File(filePath + stored_file_name);
				multipartFile.transferTo(file);
				listMap = new HashMap<String, Object>();
				listMap.put("BNO", bno);
				listMap.put("ORG_FILE_NAME", original_file_name);
				listMap.put("STORED_FILE_NAME", stored_file_name);
				listMap.put("FILE_SIZE", multipartFile.getSize());
				list.add(listMap);
			}
		}
		return list;
	}
	

	public static String getRandomString() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
