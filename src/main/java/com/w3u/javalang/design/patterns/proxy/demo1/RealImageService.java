package com.w3u.javalang.design.patterns.proxy.demo1;

public class RealImageService implements ImageService {
    @Override
    public void downloadImage(String name) {
        System.out.println("Downloading image: " + name);
        // actual downloading
    }
}
