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
public class Data {

    private String id;
    private String name;
    private List<Menu> menu;
    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setMenu(List<Menu> menu) {
         this.menu = menu;
     }
     public List<Menu> getMenu() {
         return menu;
     }

}