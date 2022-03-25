/**
  * Copyright 2022 bejson.com 
  */
package com.yltrcc.frs.module.entity;
import java.util.List;

/**
 * Auto-generated: 2022-03-25 12:51:3
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data1 {

    private int code;
    private String message;
    private List<Data> data;
    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setData(List<Data> data) {
         this.data = data;
     }
     public List<Data> getData() {
         return data;
     }

}