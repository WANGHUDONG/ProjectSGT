package com.rain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import static com.rain.util.common.Constants.FAMILYTABLE;

import com.rain.domain.Family;

public interface FamilyDao {

	/*
	 * 
	 */
	@Select("SELECT * FROM " + FAMILYTABLE + "")
	List<Family> findAllFamily();
	
}
