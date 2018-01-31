package com.fortis.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created by ft on 2018/1/16.
 */
@ManagedBean(name="actionBean")
@ViewScoped
public class ActionBean implements Serializable {

    @ManagedProperty("#{demoService}")
    private DemoService service;

    public ActionBean(){

    }

    public String buttonAction(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        DemoService service = (DemoService) ctx.getBean("demoService");
        return service.getString();
    }

    public DemoService getService() {
        return service;
    }

    public void setService(DemoService service) {
        this.service = service;
    }
}
