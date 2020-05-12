package com.mycompany.myapp.VO;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

public class FileVO {


	private int file_num;
	
	private int date;
	
	private String original_file_name;
	
	private String stored_file_name;

	private int file_size;

	public int getFile_num() {
		return file_num;
	}


	public void setFile_num(int file_num) {
		this.file_num = file_num;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}


	public String getOriginal_file_name() {
		return original_file_name;
	}


	public void setOriginal_file_name(String original_file_name) {
		this.original_file_name = original_file_name;
	}


	public String getStored_file_name() {
		return stored_file_name;
	}


	public void setStored_file_name(String stored_file_name) {
		this.stored_file_name = stored_file_name;
	}


	public int getFile_size() {
		return file_size;
	}


	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}


	@Override
	public String toString() {
		return "FileVO [file_num=" + file_num + ", date=" + date + ", original_file_name=" + original_file_name
				+ ", stored_file_name=" + stored_file_name + ", file_size=" + file_size + "]";
	}
}
