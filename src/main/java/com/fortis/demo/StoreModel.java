package com.fortis.demo;

import java.io.Serializable;

/**
 * Created by ft on 2018/1/29.
 */
public class StoreModel{

  private Integer id;
  private String name;
  private String storeRate;
  private String docRate;
  private String count;

  public StoreModel(){
    this.name = "分组（成都）";
    this.storeRate = "100/300";
    this.docRate = "50/200";
    this.count = "1.5";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStoreRate() {
    return storeRate;
  }

  public void setStoreRate(String storeRate) {
    this.storeRate = storeRate;
  }

  public String getDocRate() {
    return docRate;
  }

  public void setDocRate(String docRate) {
    this.docRate = docRate;
  }

  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
