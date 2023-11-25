package com.mufeng.test.proxy.dongtai;

public class ShopperImpl implements Shopper {
    @Override
    public void saleWatermelon(String customer) {
        System.out.println("瓜已出售给:" + customer);
    }

    @Override
    public void saleLemon(String customer) {
        System.out.println("柠檬已出售给:" + customer);
    }
}
