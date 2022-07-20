package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	// MyBatis를 이용해서 SQL을 처리할 때 어노테이션을 이용하는 방식이 압도적으로 편리함
	// SQL이 복잡하거나 길어지는 경우에는 어노테이션 보다는 XML을 이용하는 방식을 더 선호하게 됨
	// MyBatis-Spring의 경우 Mapper 인터페이스와 XML을 동시에 이용할 수 있음
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	public String getTime2();
}
