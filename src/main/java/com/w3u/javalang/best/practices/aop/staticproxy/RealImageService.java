package com.w3u.javalang.best.practices.aop.staticproxy;

public class RealImageService implements ImageService {
    @Override
    public void downloadImage(String name) {
        System.out.println("Downloading image: " + name);
    }
}
