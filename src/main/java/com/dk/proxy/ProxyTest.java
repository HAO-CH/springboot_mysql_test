package com.dk.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        //真实实现
        RealMovie realmovie = new RealMovie();

        //动态代理方式
        DynamicCinemaProxy  cinemaInvocation = new DynamicCinemaProxy(realmovie);
        //loader 自然是类加载器;interfaces 代码要用来代理的接口;  h 一个 InvocationHandler 对象
        Movie movie = (Movie) Proxy.newProxyInstance(Movie.class.getClassLoader(),new Class[]{Movie.class},cinemaInvocation);
        movie.player();
    }
}
