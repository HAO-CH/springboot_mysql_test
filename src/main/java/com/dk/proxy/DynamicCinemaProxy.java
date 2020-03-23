package com.dk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class DynamicCinemaProxy implements InvocationHandler {

    Object object;

    public DynamicCinemaProxy (Object object){
        this.object = object;
    }

    /**
     * @param proxy 代理对象
     * @param method 代理对象调用的方法
     * @param args 调用的方法中的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("|||||||||||||||||||||||电影开始前,卖爆米花");
        method.invoke(object,args);
        System.out.println("----------------------电影结束了，打扫卫生");
        return null;
    }
}
