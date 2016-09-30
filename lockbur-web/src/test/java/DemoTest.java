
import com.aboutdata.commons.enums.CommentsType;
import com.aboutdata.dao.CommentsDao;
import com.aboutdata.domain.Comments;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 时间: 2015-7-15
 *
 * @author aboutdata
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:application-Context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/spring-context.xml")
public class DemoTest extends AbstractJUnit4SpringContextTests {

    public static Logger logger = LoggerFactory.getLogger(DemoTest.class);


    @Resource
    private CommentsDao commentsDao;

    public void empty() {

    }

    @Test
    public void findByIdTest() {
//        Comments comments = new Comments();
//
//        comments.setType(CommentsType.User);
//        comments.setEntityId("111111111111111111");
//        comments.setComment("[D:\\workspace\\GitHub\\aboutdata\\src\\main\\webapp]");
//
//        Member m =new Member();
//        m.setId("1");
//        
//        comments.setMember(m);
//        commentsDao.save(comments);

        List<Comments> list = commentsDao.findByTypeAndEntityId(CommentsType.User,"111111111111111111");
        
        System.out.println("###"+list.size());
        
        logger.info("############### {}",list.size());
    }

}
