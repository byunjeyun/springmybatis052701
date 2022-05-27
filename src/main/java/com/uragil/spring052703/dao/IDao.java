package com.uragil.spring052703.dao;

import java.util.ArrayList;

import com.uragil.spring052703.dto.ContentDto;

public interface IDao {

	public ArrayList<ContentDto> listDao();
	public void writeDao(String mwriter, String mcontent);
	public void deleteDao(String mnum);

}

