package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
// Java 설정을 사용하는 경우
// @ContextConfiguration(classes= {org.zerock.config.RootConfig.class})
@Log4j
public class TimeMapperTests {
    
    @Setter(onMethod_ = @Autowired)
    private TimeMapper timeMapper;
    
//    @Test
//    public void testGetTime() {
//    	
//    	try {
//        	log.info(timeMapper.getClass().getName());
//        	log.info(timeMapper.getTime());
//    	} catch (Exception e) {
//    		e.printStackTrace();
//    	}
//    }
    
    @Test
    public void testGetTime2() {
    	
    	try {
        	log.info("getTime2");
        	log.info(timeMapper.getTime2());
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

}