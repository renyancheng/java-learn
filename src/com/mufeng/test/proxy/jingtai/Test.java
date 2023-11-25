package com.mufeng.test.proxy.jingtai;

public class Test {
    public static void main(String[] args) {
        Shopper shopper =  new ShopperImpl();
        Shopper shopperProxy = new ShopperProxy(shopper);
        shopperProxy.saleWatermelon("华强");
    }
}
