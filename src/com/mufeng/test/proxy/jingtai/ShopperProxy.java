package com.mufeng.test.proxy.jingtai;

public class ShopperProxy implements Shopper {
    private final Shopper impl;

    ShopperProxy(Shopper impl){
        this.impl = impl;
    }

    public void saleWatermelon(String customer){
        System.out.println("我是代理，帮你把瓜卖了");

        impl.saleWatermelon(customer);
    }
}
