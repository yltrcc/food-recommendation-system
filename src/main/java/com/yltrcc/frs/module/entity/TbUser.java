package com.yltrcc.frs.module.entity;

import java.sql.Timestamp;

public class TbUser {

  private long user_id;
  private String user_name;
  private String loginName;
  private String pwd;
  private String sex;
  private String identity;
  private String tel;
  private long state;
  private java.sql.Timestamp addTime;
  private String wxNickname;
  private String user_type;
  private Long shopId;
  private String userPortrait;
  private String userInfo;

  public String getUserPortrait() {
    return userPortrait;
  }

  public void setUserPortrait(String userPortrait) {
    this.userPortrait = userPortrait;
  }

  public String getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(String userInfo) {
    this.userInfo = userInfo;
  }

  public String getUser_type() {
    return user_type;
  }

  public void setUser_type(String user_type) {
    this.user_type = user_type;
  }

  public Long getShopId() {
    return shopId;
  }

  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }

  public String getType() {
    return user_type;
  }

  public void setType(String user_type) {
    this.user_type = user_type;
  }

  public long getUser_id() {
    return user_id;
  }

  public void setUser_id(long user_id) {
    this.user_id = user_id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

  public Timestamp getAddTime() {
    return addTime;
  }

  public void setAddTime(Timestamp addTime) {
    this.addTime = addTime;
  }

  public String getWxNickname() {
    return wxNickname;
  }

  public void setWxNickname(String wxNickname) {
    this.wxNickname = wxNickname;
  }
}
