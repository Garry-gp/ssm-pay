package com.pay.model;


public class SysRole {

  private long index;
  private String roleId;
  private String name;
  private String title;
  private String description;
  private long ctime;
  private long orders;


  public long getIndex() {
    return index;
  }

  public void setIndex(long index) {
    this.index = index;
  }


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getCtime() {
    return ctime;
  }

  public void setCtime(long ctime) {
    this.ctime = ctime;
  }


  public long getOrders() {
    return orders;
  }

  public void setOrders(long orders) {
    this.orders = orders;
  }

}
