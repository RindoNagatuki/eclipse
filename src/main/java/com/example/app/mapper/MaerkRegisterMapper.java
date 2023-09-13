package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.MaerkRegister;

@Mapper
public interface MaerkRegisterMapper  {

	List<MaerkRegister> selectAll();
	
	List<MaerkRegister> selectById(int id);
	
	List<MaerkRegister> selectByName(String name);
	
	List<MaerkRegister> selectByUserName(String UserName);
	
	List<MaerkRegister> selectBySNSname(String SNSname);
	
	List<MaerkRegister> selectByURL(String URL);
	
	void add(MaerkRegister maerkregister);
} 
