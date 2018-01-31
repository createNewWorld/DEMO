package com.fortis.doctormonitor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by ft on 2018/1/16.
 */
public class AroundAdvice implements MethodInterceptor {


    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("Around start" + this.getClass().getName());
        Object object = invocation.proceed();
        System.out.println("Around end" + this.getClass().getName());

        return object;
    }
}
