package com.docjenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class DocjenkinsApplicationTests {
	private static final Logger logger = LoggerFactory.getLogger(DocjenkinsApplicationTests.class);

	@Test
	void Test1() {
        Assertions.assertTrue(true);
		logger.info("test case1 passed");
    }
	@Test
	void Test2() {
        Assertions.assertTrue(true);
		logger.info("test case2 passed");
    }
	@Test
	void Test3() {
        Assertions.assertTrue(true);
		logger.info("test case3 passed");
    }

}
