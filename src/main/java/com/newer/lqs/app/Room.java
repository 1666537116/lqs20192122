package com.newer.lqs.app;

/**
 * @author 梁虔硕版权所有 哈哈哈哈
 * @date 2019/12/22 - 16:35
 */
public class Room {
  private String  roomid;
    private Integer num;
    private  Integer  price ;
    private Integer state ;

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomid='" + roomid + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", state=" + state +
                '}';
    }
}
