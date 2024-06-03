package com.w3u.javalang.best.practices.aop.dynamicproxy;

public class RealVideoService implements VideoService {
    @Override
    public void downloadVideo(String name) {
        System.out.println("Downloading video: " + name);
        // actual downloading
    }
}
