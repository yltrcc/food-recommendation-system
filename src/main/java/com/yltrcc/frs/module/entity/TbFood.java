package com.yltrcc.frs.module.entity;


import java.util.Date;

public class TbFood {

  private long food_id;
  private String food_name;
  private String food_cal;
  private String taste;
  private String location;
  private long recorde;
  private Date add_time;
  private long userId;
  private String img;
  private String info;
  private String canteen;
  private long likeCount;
  private long collectCount;
  private long commentCount;
  private Long shopId;
  private Long price;
  private Long category_id;

  public String getFood_cal() {
    return food_cal;
  }

  public void setFood_cal(String food_cal) {
    this.food_cal = food_cal;
  }

  public Long getShopId() {
    return shopId;
  }

  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Long getCategory_id() {
    return category_id;
  }

  public void setCategory_id(Long category_id) {
    this.category_id = category_id;
  }

  public long getFood_id() {
    return food_id;
  }

  public void setFood_id(long food_id) {
    this.food_id = food_id;
  }

  public String getFood_name() {
    return food_name;
  }

  public void setFood_name(String food_name) {
    this.food_name = food_name;
  }

  public String getFoodCal() {
    return food_cal;
  }

  public void setFoodCal(String food_cal) {
    this.food_cal = food_cal;
  }

  public String getTaste() {
    return taste;
  }

  public void setTaste(String taste) {
    this.taste = taste;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public long getRecorde() {
    return recorde;
  }

  public void setRecorde(long recorde) {
    this.recorde = recorde;
  }

  public Date getAdd_time() {
    return add_time;
  }

  public void setAdd_time(Date add_time) {
    this.add_time = add_time;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public String getCanteen() {
    return canteen;
  }

  public void setCanteen(String canteen) {
    this.canteen = canteen;
  }

  public long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(long likeCount) {
    this.likeCount = likeCount;
  }

  public long getCollectCount() {
    return collectCount;
  }

  public void setCollectCount(long collectCount) {
    this.collectCount = collectCount;
  }

  public long getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(long commentCount) {
    this.commentCount = commentCount;
  }
}
