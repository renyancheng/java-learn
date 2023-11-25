package com.mufeng.test.proxy.dongtai;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Shopper impl = new ShopperImpl();
        Shopper shopper = (Shopper) Proxy.newProxyInstance(impl.getClass().getClassLoader(), impl.getClass().getInterfaces(), new ShopperProxy(impl));
        shopper.saleWatermelon("lihua");
        System.out.println("--------");
        shopper.saleLemon("niaho");
        System.out.println(shopper.getClass());
    }
}
