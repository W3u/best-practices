package com.w3u.javalang.best.practices.aop.dynamicproxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        ImageService imageService = (ImageService) Proxy.newProxyInstance(
                ImageService.class.getClassLoader(),
                new Class[]{ImageService.class},
                new MediaServiceInvocationHandler(new RealImageService())
        );

        System.out.println("imageService interfaces: " + Arrays.toString(imageService.getClass().getInterfaces()));
        System.out.println("imageService superclass: " + imageService.getClass().getSuperclass());

        for (Method method : imageService.getClass().getMethods()) {
            System.out.println("imageService method: " + method.getName());
        }

        VideoService videoService = (VideoService) Proxy.newProxyInstance(
                VideoService.class.getClassLoader(),
                new Class[]{VideoService.class},
                new MediaServiceInvocationHandler(new RealVideoService())
        );

        videoService.downloadVideo("abc.mp4");

        // class VideoServiceProxy extends Proxy implements VideoService {
        //      public void downloadVideo(String name) {
        //          invocationHandler.invoke(this, VideoService.class.getMethod("downloadVideo", String.class), new Object[]{name});
        //      }
        // }
    }


}
