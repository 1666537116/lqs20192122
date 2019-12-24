package com.newer.lqs.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.org.apache.xml.internal.security.Init;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author 梁虔硕版权所有 哈哈哈哈
 * @date 2019/12/22 - 16:30
 */
@WebServlet( "/CheckInServlet")
public class AppServlet extends HttpServlet {
    CheckInDao checkInDao = null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        checkInDao = sqlSession.getMapper(CheckInDao.class);
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     response.setCharacterEncoding("utf-8");
     request.setCharacterEncoding("utf-8");
     String method = request.getParameter("mehtod");
     if("findAll".equals(method)){
         PrintWriter pw =response.getWriter();
         System.out.println("finAll");
         Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
         List<CheckIn> checkInList = checkInDao.findAll();
         pw.print(gson.toJson(checkInList));
         pw.close();
     }else {
         Integer cid =Integer.valueOf(request.getParameter("cid")) ;
         PrintWriter pw =response.getWriter();
           Integer count = checkInDao.update(cid);
           pw.print(count);
           pw.close();

     }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   doPost(request,response);
    }
}
