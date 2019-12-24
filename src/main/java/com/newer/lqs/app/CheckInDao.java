package com.newer.lqs.app;

import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 梁虔硕版权所有 哈哈哈哈
 * @date 2019/12/22 - 16:39
 */
public interface CheckInDao {
    //查询酒店入住信息
    @Results(value = {
         @Result(property = "cid", column = "cid"),
            @Result(property = "name", column = "name"),
            @Result(property = "checkinTime", column = "checkin_time"),

            @Result(property = "room",column = "cid",javaType = com.newer.lqs.app.Room.class,
            one =@One(select = "com.newer.lqs.app.CheckInDao.findByCid"))
    })
    @Select("select * from checkins")
    public List<CheckIn> findAll() ;

    //	更新结账状态
    @Update("UPDATE checkins set state=1 where  cid = #{cid}")
    public Integer update(Integer cid);
    //根据房间编号查询入住房间信息
    @Select("select * from rooms where roomid= #{roomid}")
    Room findByCid( @Param("roomid") Integer roomid);

}
