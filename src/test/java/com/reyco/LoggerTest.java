package com.reyco;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Reyco
 * @create 2019/6/14-16:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test(){
        String name ="reyco";
        String pwd = "123456";
        logger.info("info...");
        logger.debug("name: " + name + "pwd:" + pwd);
        logger.debug("name:{}, pwd:{}",name,pwd);
        logger.error("error...");
    }
}
