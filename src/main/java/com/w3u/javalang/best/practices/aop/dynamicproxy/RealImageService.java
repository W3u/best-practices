package com.w3u.javalang.best.practices.aop.dynamicproxy;

public class RealImageService implements ImageService {
    @Override
    public void downloadImage(String name) {
        System.out.println("Downloading image: " + name);
        // actual downloading
    }
}