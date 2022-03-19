package com.yltrcc.frs.module.entity;


public class TbCategory {

  private long categoryId;
  private String categoryName;
  private String categoryDescribe;
  private long shopId;


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public String getCategoryDescribe() {
    return categoryDescribe;
  }

  public void setCategoryDescribe(String categoryDescribe) {
    this.categoryDescribe = categoryDescribe;
  }


  public long getShopId() {
    return shopId;
  }

  public void setShopId(long shopId) {
    this.shopId = shopId;
  }

}
