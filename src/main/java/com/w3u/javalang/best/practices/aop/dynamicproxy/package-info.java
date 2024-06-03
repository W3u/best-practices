package com.w3u.javalang.best.practices.aop.dynamicproxy;

/*
JVM 实际上并不直接提供用户级别的代码来展示如何动态生成代理类的内部实现细节，这部分逻辑封装在Java标准库的 java.lang.reflect.Proxy 类中，具体实现在JDK源码里。不过，我可以概述一下JVM和Java标准库如何协同工作来实现这一功能的高级流程，以及简述Proxy类的关键部分。
高级流程概述
请求生成代理类：当调用 Proxy.newProxyInstance() 方法时，JVM接收到生成代理类的请求。
类加载器与接口验证：JVM通过传入的类加载器检查目标接口的有效性，并确保没有重复的接口。
代理类的名称生成：JVM会为代理类生成一个唯一的名称，通常遵循 $ProxyN 的格式，其中N是一个递增的数字。
代理类字节码生成：这是核心步骤，虽然不是直接由用户代码控制，但JVM会根据接口信息动态生成代理类的字节码。这个过程涉及到了方法表的构建、方法调用转发至 InvocationHandler 的逻辑等。
类加载与初始化：生成的字节码会被转换成类，并通过指定的类加载器加载到JVM中。代理类会被初始化，这意味着它的静态初始化块（如果有的话）会被执行。
代理实例创建：最后，使用代理类和之前传入的 InvocationHandler 实例来创建代理对象。
*/
