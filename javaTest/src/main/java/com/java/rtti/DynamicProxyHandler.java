package com.java.rtti;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.InterfaceAddress;

public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*****proxy: " + proxy.getClass() + ",method:" + method + ",args:" + args);
        if (args != null)
            for (Object arg : args)
                System.out.println(" " + arg);
        return method.invoke(proxied, args);
    }
//    class SimpleDynamicProxy{
//        public static  void consumer(interface )
//    }

    public static void main(String[] args) {
        String abc = new String("abc");
        String abc2= new String("abc");
        String abc1 = "abc";
        System.out.println(abc.equals(abc2));
        System.out.println(abc==abc2);
    }
}
