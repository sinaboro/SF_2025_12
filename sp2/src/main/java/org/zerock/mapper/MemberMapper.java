package org.zerock.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.dto.MemberDTO;

@Mapper
public interface MemberMapper {

	void insert(MemberDTO dto);
}
