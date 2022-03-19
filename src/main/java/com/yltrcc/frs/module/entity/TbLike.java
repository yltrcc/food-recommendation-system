package com.yltrcc.frs.module.entity;


public class TbLike {

  private long id;
  private long userId;
  private long foodId;
  private java.sql.Timestamp ltime;
  private long lcount;
  private long commentId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getFoodId() {
    return foodId;
  }

  public void setFoodId(long foodId) {
    this.foodId = foodId;
  }


  public java.sql.Timestamp getLtime() {
    return ltime;
  }

  public void setLtime(java.sql.Timestamp ltime) {
    this.ltime = ltime;
  }


  public long getLcount() {
    return lcount;
  }

  public void setLcount(long lcount) {
    this.lcount = lcount;
  }


  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }

}
