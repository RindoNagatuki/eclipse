package com.example.app.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.Snsdata;

@Mapper
public interface SnsdataMapper {

	void register(Snsdata snsdata);
	void add(Snsdata snsdata);
}

