package com.pay.model;


public class SysPermission {

  private long permissionId;
  private long systemId;
  private long pid;
  private String name;
  private long type;
  private String permissionValue;
  private String uri;
  private String icon;
  private long status;
  private long ctime;
  private long orders;


  public long getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(long permissionId) {
    this.permissionId = permissionId;
  }


  public long getSystemId() {
    return systemId;
  }

  public void setSystemId(long systemId) {
    this.systemId = systemId;
  }


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getPermissionValue() {
    return permissionValue;
  }

  public void setPermissionValue(String permissionValue) {
    this.permissionValue = permissionValue;
  }


  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
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
