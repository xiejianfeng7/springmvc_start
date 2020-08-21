package cn.nci.service;

import cn.nci.pojo.UserDao;

/**
 * @PackgeName: cn.nci.service
 * @ClassName: UserService
 * @Author: WangXiaolin
 * Date: 2020/6/21 18:53
 * project name: springmvc_start
 * @Version:
 * @Description:
 */
public class UserService {
    /*声明userDao属性*/
    private UserDao userDao;
    /*添加userDao属性的setter方法，用于实现依赖注入*/
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void saySomething(){
        this.userDao.saySomething(); //测试userDao是否注入
        System.out.println("UserService saySomething");
    }
}
