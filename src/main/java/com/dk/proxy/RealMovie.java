package com.dk.proxy;

/**
 * 真实实现类 /委托类
 */
public class RealMovie implements Movie {

    @Override
    public void player() {
        System.out.println(">>>>>>>> 您正在观看《东科1902·奋斗史》");
    }

}
