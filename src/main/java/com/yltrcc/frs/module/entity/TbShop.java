package com.yltrcc.frs.module.entity;

public class TbShop {

  private long id;
  private String shopName;
  private String shopDesc;
  private String shopSales;
  private String shopUrl;
  private String location;
  private long likeCount;
  private long collectCount;
  private long commentCount;
  private String canteen;
  private String notice;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }


  public String getShopDesc() {
    return shopDesc;
  }

  public void setShopDesc(String shopDesc) {
    this.shopDesc = shopDesc;
  }


  public String getShopSales() {
    return shopSales;
  }

  public void setShopSales(String shopSales) {
    this.shopSales = shopSales;
  }


  public String getShopUrl() {
    return shopUrl;
  }

  public void setShopUrl(String shopUrl) {
    this.shopUrl = shopUrl;
  }


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
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


  public String getCanteen() {
    return canteen;
  }

  public void setCanteen(String canteen) {
    this.canteen = canteen;
  }


  public String getNotice() {
    return notice;
  }

  public void setNotice(String notice) {
    this.notice = notice;
  }

}
