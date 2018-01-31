package com.fortis.doctormonitor;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ft on 2018/1/29.
 */
@ManagedBean(name="storeGridView")
public class StoreGridView implements Serializable {

  private static final long serialVersionUID = -8957407247227581622L;

  private List<StoreModel> storeModelList;

  @PostConstruct
  public void init(){

      storeModelList = new ArrayList<StoreModel>();
      for(int i = 0; i < 21; i ++){
        StoreModel model = new StoreModel();
        model.setId(i+1);
        storeModelList.add(model);
      }
  }

  public List<StoreModel> getStoreModelList() {
    return storeModelList;
  }

  public void setStoreModelList(List<StoreModel> storeModelList) {
    this.storeModelList = storeModelList;
  }
}
