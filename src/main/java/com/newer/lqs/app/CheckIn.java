package com.newer.lqs.app;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author 梁虔硕版权所有 哈哈哈哈
 * @date 2019/12/22 - 16:31
 */
public class CheckIn implements Serializable {
  private  Integer cid;// 入住编号
    private  Integer id;
    private String name;// 客人姓名cid 入住编号
    private String sex ;//性别
    private Date checkinTime ;//入住时间
    private String cardtype ;//证件类型
    private String cardno;//    证件编号
    private  String state;
    private  Room room;//入住的房间

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //private  Integer num;

    /*public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }*/

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CheckIn{" +
                "cid=" + cid +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", checkinTime=" + checkinTime +
                ", cardtype='" + cardtype + '\'' +
                ", cardno='" + cardno + '\'' +
                ", room=" + room +

                '}';
    }
}
