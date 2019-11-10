package cn.lbq.test;

import cn.lbq.dao.UserAccountDao;
import cn.lbq.entity.UserAccount;
import cn.lbq.service.UserAccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {

    @org.junit.Test
    public void serviceTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserAccountService userAccountService  =  ac.getBean("userAccountService",UserAccountService.class);
        userAccountService.findAll();
    }

    @org.junit.Test
    public void mybatisTest() throws IOException {
//        InputStream in  = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory sessionFactory  = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession  = sessionFactory.openSession(true);
//        UserAccountDao userAccountDao = sqlSession.getMapper(UserAccountDao.class);
//        UserAccount userAccount  = new UserAccount();
//        userAccount.setName("北方");
//        userAccount.setMoney(999);
//
//        List<UserAccount> list  = userAccountDao.findAll();
//        int result = userAccountDao.saveAccount(userAccount) ;
//        if(result>0){
//            System.out.println("保存成功");
//        }else {
//            System.out.println("保存失败");
//        }

//        for (UserAccount user:list ){
//            System.out.println(user);
//        }
//
//        sqlSession.close();
//        in.close();

    }
}
