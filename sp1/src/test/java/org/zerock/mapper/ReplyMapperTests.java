package org.zerock.mapper;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.dto.ReplyDTO;

import lombok.extern.log4j.Log4j2;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
class ReplyMapperTests {

	@Autowired
	private ReplyMapper replyMapper;
	
	@Test
	public void testInsert() {
		
		ReplyDTO replyDTO = ReplyDTO.builder()
				.bno(11665218L)
				.replyText("댓글 내용3")
				.replyer("박길동")
				.build();
		
		int result = replyMapper.insert(replyDTO);
		log.info("result : " + result);
		log.info("rno : " + replyDTO.getRno());
		
	}
	
	@Test
	public void testRead() {
		ReplyDTO dto = replyMapper.read(4);
		log.info("dto : " +dto);
	}

	@Test
	public void testDelete() {
		
		log.info("result : " + replyMapper.delete(4));
	}
	

}
