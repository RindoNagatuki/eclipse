package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.Add;
@Mapper
public interface AddMapper {

	List<Add> selectByUserName(String UserName);
	
	List<Add> selectBySNSname(String SNSname);
	
	List<Add> selectByURL(String URL);
	
	void add (Add add);
}
