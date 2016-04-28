package com.mx.stickylistview.model;

import java.io.Serializable;

/**
 * Created by boobooL on 2016/4/28 0028
 * Created 邮箱 ：boobooMX@163.com
 */
public class TravelingEntity implements Serializable,Comparable<TravelingEntity> {
    private String type;//风景、动物、植物、建筑
    private String title;//标题
    private String from;//来源
    private int  rank;//排名
    private String image_url;//图片的地址
    private  boolean isNoData=false;//暂无数据属性
    private int height;

    public TravelingEntity() {
    }

    public TravelingEntity(String type, String title, String from, int rank, String image_url) {
        this.type = type;
        this.title = title;
        this.from = from;
        this.rank = rank;
        this.image_url = image_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public boolean isNoData() {
        return isNoData;
    }

    public void setNoData(boolean noData) {
        isNoData = noData;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(TravelingEntity another) {
        return this.getRank()-another.getRank();
    }
}
