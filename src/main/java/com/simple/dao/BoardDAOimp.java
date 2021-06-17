package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;

@Repository("boardDAO")
public class BoardDAOimp implements BoardDAO {

	private ArrayList<BoardVO> list = new ArrayList<>();
	
	@Override
	public void boardRegist(BoardVO vo) {
		list.add(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		
		return list;
	}

	@Override
	public void boardDelete(int num) {
		
		list.remove(num);
	}

	
	
	

}
