package com.fortis.doctormonitor;

import org.springframework.stereotype.Service;

/**
 * Created by ft on 2018/1/16.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @CheckAction
    public String getString(){
        return "helloworld.xhtml";
    }
}
