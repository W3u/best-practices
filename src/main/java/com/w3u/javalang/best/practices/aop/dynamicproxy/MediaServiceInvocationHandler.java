package com.w3u.javalang.best.practices.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalTime;

public class MediaServiceInvocationHandler implements InvocationHandler {

    private final Object target;

    public MediaServiceInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        checkTime();

        return method.invoke(target, args);
    }

    private void checkTime() {
        LocalTime startTime = LocalTime.of(0, 0, 0);
        LocalTime endTime = LocalTime.of(5, 59, 59);
        LocalTime now = LocalTime.now();

        if (now.isAfter(startTime) && now.isBefore(endTime)) {
            throw new RuntimeException("Download is not allowed during the night");
        }
    }

}
