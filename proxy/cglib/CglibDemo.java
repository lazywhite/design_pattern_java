/*
 * CglibDemo.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 * 被代理对象可以是任意类, 无需实现某些接口
 */

public class CglibDemo {
    public static void main(String[] args){
        Proxy proxy = new Proxy();
        User userImpl = (User)proxy.getProxy(User.class);
        userImpl.say();
    }
}

