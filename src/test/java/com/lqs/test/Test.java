package com.lqs.test;

import com.newer.lqs.app.CheckIn;
import com.newer.lqs.app.CheckInDao;
import com.newer.lqs.app.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author 梁虔硕版权所有 哈哈哈哈
 * @date 2019/12/22 - 17:40
 */
public class Test {
    @org.junit.Test
    public void test(){
        CheckInDao checkInDao = null;
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        checkInDao = sqlSession.getMapper(CheckInDao.class);
       List<CheckIn> list= checkInDao.findAll();
        for (CheckIn checkIn : list) {
            System.out.println(checkIn.getRoom());
        }
        sqlSession.close();
    }
}
