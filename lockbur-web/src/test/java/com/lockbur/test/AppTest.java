package com.lockbur.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangkun23 on 2016/9/30.
 */
public class AppTest extends TestBase{
    private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Test
    public void empty() {
        logger.debug("{} was tested", AppTest.class.getSimpleName());
    }

}
