package com.sankha.misc.chain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectHandler implements InvocationHandler {

    private Object object;

    public ObjectHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().contains("put")){
            if(args[0].equals("java")){
                System.out.println("invalid key");
                return null;
            }

        }

        //logic before method
        System.out.println("logic before method");
        Object invoke = method.invoke(object, args);
        //logic after method call
        System.out.println("logic after method");
        return invoke;
    }
}
