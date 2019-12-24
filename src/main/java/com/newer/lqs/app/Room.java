package com.newer.lqs.app;

/**
 * @author 梁虔硕版权所有 哈哈哈哈
 * @date 2019/12/22 - 16:35
 */
public class Room {
  private String  roomid;//  房间号
    private Integer num;//     入住天数
    private  Integer  price ;// 房间单价
    private Integer state ;//   结账状态（0：未结账，1：已结账）

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
