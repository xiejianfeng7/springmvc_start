package cn.nci.test;

import cn.nci.pojo.UserDao;
import cn.nci.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @PackgeName: cn.nci.test
 * @ClassName: JUnitTest
 * @Author: WangXiaolin
 * Date: 2020/6/21 18:52
 * project name: springmvc_start
 * @Version:
 * @Description:
 */
public class JUnitTest {
    @Test
    public void saySomethingTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        userDao.saySomething();
    }

    @Test
    public void dependencyInjectionTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saySomething();
    }
}
