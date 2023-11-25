package com.mufeng.test.proxy.jingtai;

public class ShopperImpl implements Shopper{
    @Override
    public void saleWatermelon(String customer){
        System.out.println("瓜出售给了：" + customer);
    }
}
