package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	// 세미콜론이 없어야 한다!!
	@Select("select NOW()")
	public String getTime();
	
	public String getTime2();
}