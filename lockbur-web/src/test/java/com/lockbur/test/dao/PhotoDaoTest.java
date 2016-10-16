package com.lockbur.test.dao;

import com.aboutdata.dao.PhotoDao;
import com.lockbur.test.TestBase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/16.
 */
public class PhotoDaoTest extends TestBase {
    private static final Logger logger = LoggerFactory.getLogger(PhotoDaoTest.class);

    @Resource
    private PhotoDao photoDao;

    @Test
    public void findAll() {
        List<String> ids = photoDao.findAllIds();
        logger.info("size {}", ids.size());
    }
}
