package com.mufeng.test.proxy.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ShopperProxy implements InvocationHandler {
    Object target;

    public ShopperProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String customer = (String) args[0];
        System.out.println("代理把货物给了：" + customer);
        return method.invoke(target, args);
    }
}
